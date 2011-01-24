package randy.interpreter.antlr;

import java.io.IOException;
import java.util.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;
import randy.ast.*;
import randy.exception.*;
import randy.generated.antlr.*;
import randy.generated.antlr.Oberon0Parser.module_return;
import randy.value.*;

public class Oberon0ASTTreeGenerator
{
	public OASTNode generate(String filename) throws Oberon0Exception
	{
		Oberon0Lexer lexer = null;
		try
		{
			// Put the file through the lexer
			lexer = new Oberon0Lexer(new ANTLRFileStream(filename));
		}
		catch (IOException e)
		{
			throw new Oberon0ASTTreeBuildException("Problem reading or lexing file: " + e.getMessage());
		}
		CommonTokenStream tokens = new CommonTokenStream();
		tokens.setTokenSource(lexer);
		
		// Parse the program
		Oberon0Parser parser = new Oberon0Parser(tokens);
		module_return parserOutput = null;
		try
		{
			parserOutput = parser.module();
		}
		catch (RecognitionException e)
		{
			throw new Oberon0ASTTreeBuildException("Problem parsing file: " + e.getMessage());
		}
		
		return buildASTTree((Tree)parserOutput.getTree());
	}
	public static OArraySelector buildArraySelector(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.ARRAYSELECTOR);
		assert(tree.getChildCount() == 2);
		OSelector lhs = buildSelector(tree.getChild(0));
		OExpression arrayIndex = buildExpression(tree.getChild(1));
		return new OArraySelector(lhs, arrayIndex);
	}
	public static OAssignmentStatement buildAssignmentStatement(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.ASSIGNMENT);
		assert(tree.getChildCount() == 2);
		if (tree.getChild(0).getType() != Oberon0Parser.LH || tree.getChild(1).getType() != Oberon0Parser.RH)
			throw new Oberon0ASTTreeBuildException("Missing LH or RH children on assignment.");
		OSelector lhs = buildSelector(tree.getChild(0).getChild(0));
		OExpression rhs = buildExpression(tree.getChild(1).getChild(0));
		return new OAssignmentStatement(lhs, rhs);
	}
	public static OASTNode buildASTTree(Tree tree) throws Oberon0Exception
	{
		assert(tree != null);
		switch (tree.getType())
		{
			case Oberon0Parser.MODULE:
				return buildModule(tree);
			default:
				throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
	public static OBlock buildBlock(Tree tree) throws Oberon0Exception
	{
		List<OStatement> statements = new Vector<OStatement>();
		for (int i=0;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			statements.add(buildStatement(child));
		}
		return new OBlock(statements);
	}
	public static OBodyDeclaration buildBodyDeclaration(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.VAR:
				return buildVarDeclaration(tree);
			case Oberon0Parser.CONST:
				return buildConstDeclaration(tree);
			case Oberon0Parser.PROCEDURE:
				return buildProcedureDeclaration(tree);
			default:
				throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + "."); 
		}
	}public static OConstDeclaration buildConstDeclaration(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.CONST);
		assert(tree.getChildCount() == 2);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		String name = tree.getChild(0).getText();
		OExpression value = buildExpression(tree.getChild(1));
		return new OConstDeclaration(name, value);
	}
	public static OExpression buildExpression(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.MINUS:
			case Oberon0Parser.PLUS:
			case Oberon0Parser.DIVIDE:
			case Oberon0Parser.TIMES:
			case Oberon0Parser.GREATERTHEN:
			case Oberon0Parser.SMALLERTHEN:
			case Oberon0Parser.GREATEREQUALS:
			case Oberon0Parser.SMALLEREQUALS:
			case Oberon0Parser.EQUALS:
			case Oberon0Parser.AND:
			case Oberon0Parser.OR:
				return buildInfixExpression(tree);
			case Oberon0Parser.INTEGER:
				return buildIntegerLiteral(tree);
			case Oberon0Parser.PROCEDURECALL:
				return buildProcedureCall(tree);
			case Oberon0Parser.IDENT:
				return buildVariable(tree);
			case Oberon0Parser.ARRAYSELECTOR:
				return buildArraySelector(tree);
			default:
				throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
	public static OExpressionStatement buildExpressionStatement(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.EXPRESSION);
		assert(tree.getChildCount() == 1);
		return new OExpressionStatement(buildExpression(tree.getChild(0)));
	}
	public static OIfStatement buildIfStatement(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.IF);
		assert(tree.getChildCount() >= 2);
		assert(tree.getChild(1).getType() == Oberon0Parser.BODY); 
		List<Tuple<OExpression, OBlock>> ifStatements = new Vector<Tuple<OExpression, OBlock>>();
		ifStatements.add(new Tuple<OExpression, OBlock>(buildExpression(tree.getChild(0).getChild(0)), buildBlock(tree.getChild(1))));
		OBlock elseBody = null;
		for (int i=2;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.ELSIF:
					ifStatements.add(new Tuple<OExpression, OBlock>(
							buildExpression(child.getChild(0).getChild(0)),
							buildBlock(child.getChild(1))));
					break;
				case Oberon0Parser.ELSE:
					elseBody = buildBlock(child.getChild(0));
					break;
				default:
					throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
			}
		}
		return new OIfStatement(ifStatements, elseBody);
	}
	public static OInfixExpression buildInfixExpression(Tree tree) throws Oberon0Exception
	{
		assert(tree.getChildCount() == 2);
		OExpression left = buildExpression(tree.getChild(0));
		OExpression right = buildExpression(tree.getChild(1));
		Operator operator = Operator.get(tree.getText());
		if (operator == null)
			throw new Oberon0UnknownOperatorException(tree.getText());
		return new OInfixExpression(left, operator, right);
	}
	public static OIntegerLiteral buildIntegerLiteral(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.INTEGER);
		return new OIntegerLiteral(new OInteger(Integer.parseInt(tree.getText())));
	}
	public static OModule buildModule(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.MODULE);
		assert(tree.getChildCount() >= 1);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		OASTNode body = null;
		List<OBodyDeclaration> bodyDeclarations = new Vector<OBodyDeclaration>();
		for (int i=1;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.BODY:
					body = buildBlock(child);
					break;
				case Oberon0Parser.VAR:
				case Oberon0Parser.CONST:
				case Oberon0Parser.PROCEDURE:
					bodyDeclarations.add(buildBodyDeclaration(child));
					break;
				default:
					throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
			}
		}
		return new OModule(bodyDeclarations, body);
	}
	public static OProcedureCall buildProcedureCall(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.PROCEDURECALL);
		assert(tree.getChildCount() >= 2);
		String name = tree.getChild(0).getText();
		List<OExpression> parameters = new Vector<OExpression>();
		// TODO: PARAMETERS verwijderen of anders opbouwen
		if (tree.getChildCount() >= 2 && tree.getChild(1).getType() == Oberon0Parser.PARAMETERS)
		{
			for (int i=0;i<tree.getChild(1).getChildCount();i++)
			{
				parameters.add(buildExpression(tree.getChild(1).getChild(i)));
			}
		}
		return new OProcedureCall(name, parameters);
	}
	public static OProcedureDeclaration buildProcedureDeclaration(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.PROCEDURE);
		assert(tree.getChildCount() >= 1);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		String name = tree.getChild(0).getText();
		List<OVarDeclaration> parameters = new Vector<OVarDeclaration>();
		List<OBodyDeclaration> bodyDeclarations = new Vector<OBodyDeclaration>();
		OBlock body = null;
		for (int i=1;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.PARAMETERS:
					for (int j=0;j<child.getChildCount();j++)
					{
						parameters.add(buildVarDeclaration(child.getChild(j)));
					}
					break;
				case Oberon0Parser.VAR:
				case Oberon0Parser.PROCEDURE:
					bodyDeclarations.add(buildBodyDeclaration(child));
					break;
				case Oberon0Parser.BODY:
					body = buildBlock(child);
					break;
			}
		}
		
		return new OProcedureDeclaration(name, parameters, bodyDeclarations, body);
	}
	public static OSelector buildSelector(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.ARRAYSELECTOR:
				return buildArraySelector(tree);
			case Oberon0Parser.IDENT:
				return buildVariableSelector(tree);
			default:
					throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
	public static OStatement buildStatement(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.EXPRESSION:
				return buildExpressionStatement(tree);
			case Oberon0Parser.ASSIGNMENT:
				return buildAssignmentStatement(tree);
			case Oberon0Parser.WHILE:
				return buildWhileStatement(tree);
			case Oberon0Parser.IF:
				return buildIfStatement(tree);
			default:
				throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
	public static OVarDeclaration buildVarDeclaration(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.VAR || tree.getType() == Oberon0Parser.REFVAR);
		assert(tree.getChildCount() >= 1);
		assert(tree.getType() == Oberon0Parser.IDENT);
		boolean isReference = false;
		if (tree.getType() == Oberon0Parser.REFVAR)
			isReference = true;
		Type type = Type.get(tree.getChild(0).getText());
		List<String> names = new Vector<String>();
		for (int i=1;i<tree.getChildCount();i++)
		{
			names.add(tree.getChild(i).getText());
		}
		if (type == Type.ARRAY)
		{
			type = Type.get(tree.getChild(0).getChild(0).getChild(0).getText());
			OExpression arrayLength = buildExpression(tree.getChild(0).getChild(1).getChild(0));
			return new OArrayVarDeclaration(type, isReference, names, arrayLength);
		}
		else
			return new OVarDeclaration(type, isReference, names);
	}
	public static OVariable buildVariable(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.IDENT);
		String name = tree.getText();
		return new OVariable(name);
	}
	public static OVariableSelector buildVariableSelector(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.IDENT);
		String name = tree.getText();
		return new OVariableSelector(name);
	}
	public static OWhileStatement buildWhileStatement(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.WHILE);
		assert(tree.getChildCount() == 2);
		assert(tree.getChild(0).getType() == Oberon0Parser.EXPRESSION);
		OExpression expression = buildExpression(tree.getChild(0).getChild(0));
		OBlock statement = buildBlock(tree.getChild(1));
		return new OWhileStatement(expression, statement);
	}
}
