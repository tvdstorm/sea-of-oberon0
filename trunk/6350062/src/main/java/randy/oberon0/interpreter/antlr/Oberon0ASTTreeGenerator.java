package randy.oberon0.interpreter.antlr;

import java.io.IOException;
import java.util.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.Tree;
import randy.oberon0.ast.*;
import randy.oberon0.ast.datastructures.Tuple;
import randy.oberon0.exception.Exception;
import randy.oberon0.exception.*;
import randy.oberon0.generated.antlr.*;
import randy.oberon0.generated.antlr.Oberon0Parser.module_return;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Boolean;
import randy.oberon0.value.Type;

public class Oberon0ASTTreeGenerator
{
	public Module buildASTTreeFromFile(String filename) throws Exception
	{
		Oberon0Lexer lexer = null;
		try
		{
			// Put the file through the lexer
			lexer = new Oberon0Lexer(new ANTLRFileStream(filename));
		}
		catch (IOException e)
		{
			throw new ASTTreeBuildException("Problem reading or lexing file: " + e.getMessage());
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
			throw new ASTTreeBuildException("Problem parsing file: " + e.getMessage());
		}
		
		return buildASTTree((Tree)parserOutput.getTree());
	}
	public static AbstractTypeDeclaration buildAbstractTypeDeclaration(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.TYPE);
		switch (tree.getChild(1).getType())
		{
			case Oberon0Parser.RECORD:
				return buildRecordDeclaration(tree);
			default:
				throw new ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' in AbstractTypeDeclaration on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
	public static ArraySelector buildArraySelector(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.ARRAYSELECTOR);
		assert(tree.getChildCount() == 2);
		Selector lhs = buildSelector(tree.getChild(0));
		Expression arrayIndex = buildExpression(tree.getChild(1));
		return new ArraySelector(lhs, arrayIndex);
	}
	public static AssignmentStatement buildAssignmentStatement(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.ASSIGNMENT);
		assert(tree.getChildCount() == 2);
		assert(tree.getChild(0).getType() == Oberon0Parser.LH && tree.getChild(1).getType() == Oberon0Parser.RH);
		Selector lhs = buildSelector(tree.getChild(0).getChild(0));
		Expression rhs = buildExpression(tree.getChild(1).getChild(0));
		return new AssignmentStatement(lhs, rhs);
	}
	public static Module buildASTTree(Tree tree) throws Exception
	{
		assert(tree != null);
		assert(tree.getType() == Oberon0Parser.MODULE);
		return buildModule(tree);
	}
	public static Block buildBlock(Tree tree) throws Exception
	{
		List<Statement> statements = new Vector<Statement>();
		for (int i=0;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			statements.add(buildStatement(child));
		}
		return new Block(statements);
	}
	public static BodyDeclaration buildBodyDeclaration(Tree tree) throws Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.VAR:
				return buildVarDeclaration(tree);
			case Oberon0Parser.CONST:
				return buildConstDeclaration(tree);
			case Oberon0Parser.PROCEDURE:
				return buildProcedureDeclaration(tree);
			case Oberon0Parser.TYPE:
				return buildAbstractTypeDeclaration(tree);
			default:
				throw new ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' in BodyDeclaration on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + "."); 
		}
	}
	public static BooleanLiteral buildBooleanLiteral(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.TRUE || tree.getType() == Oberon0Parser.FALSE);
		return new BooleanLiteral(new Boolean(java.lang.Boolean.parseBoolean(tree.getText())));
	}
	public static ConstDeclaration buildConstDeclaration(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.CONST);
		assert(tree.getChildCount() == 2);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		String name = tree.getChild(0).getText();
		Expression value = buildExpression(tree.getChild(1));
		return new ConstDeclaration(name, value);
	}
	public static DotSelector buildDotSelector(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.DOTSELECTOR);
		assert(tree.getChildCount() == 2);
		assert(tree.getChild(1).getType() == Oberon0Parser.IDENT);
		Selector lhs = buildSelector(tree.getChild(0));
		String selector = tree.getChild(1).getText();
		return new DotSelector(lhs, selector);
	}
	public static Expression buildExpression(Tree tree) throws Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.NOT:
				return buildPrefixExpression(tree);
			case Oberon0Parser.MINUS:
				if (tree.getChildCount() == 1)
					return buildPrefixExpression(tree);
				else
					return buildInfixExpression(tree);
			case Oberon0Parser.PLUS:
			case Oberon0Parser.DIVIDE:
			case Oberon0Parser.TIMES:
			case Oberon0Parser.GREATERTHAN:
			case Oberon0Parser.SMALLERTHAN:
			case Oberon0Parser.GREATEREQUALS:
			case Oberon0Parser.SMALLEREQUALS:
			case Oberon0Parser.EQUALS:
			case Oberon0Parser.NOTEQUALS:
			case Oberon0Parser.AND:
			case Oberon0Parser.OR:
				return buildInfixExpression(tree);
			case Oberon0Parser.TRUE:
			case Oberon0Parser.FALSE:
				return buildBooleanLiteral(tree);
			case Oberon0Parser.INTEGER:
				return buildIntegerLiteral(tree);
			case Oberon0Parser.IDENT:
				return buildVariableSelector(tree);
			case Oberon0Parser.ARRAYSELECTOR:
			case Oberon0Parser.DOTSELECTOR:
				return buildSelector(tree);
			default:
				throw new ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' in Expression on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
	public static IfStatement buildIfStatement(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.IF);
		assert(tree.getChildCount() >= 2);
		assert(tree.getChild(1).getType() == Oberon0Parser.BODY); 
		List<Tuple<Expression, Block>> ifStatements = new Vector<Tuple<Expression, Block>>();
		ifStatements.add(new Tuple<Expression, Block>(buildExpression(tree.getChild(0).getChild(0)), buildBlock(tree.getChild(1))));
		Block elseBody = null;
		for (int i=2;i<tree.getChildCount();i++)
		{
			Tree child = tree.getChild(i);
			switch (child.getType())
			{
				case Oberon0Parser.ELSIF:
					ifStatements.add(new Tuple<Expression, Block>(
							buildExpression(child.getChild(0).getChild(0)),
							buildBlock(child.getChild(1))));
					break;
				case Oberon0Parser.ELSE:
					elseBody = buildBlock(child.getChild(0));
					break;
				default:
					throw new ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' in IfStatement on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
			}
		}
		return new IfStatement(ifStatements, elseBody);
	}
	public static InfixExpression buildInfixExpression(Tree tree) throws Exception
	{
		assert(tree.getChildCount() == 2);
		Expression left = buildExpression(tree.getChild(0));
		Expression right = buildExpression(tree.getChild(1));
		switch (tree.getType())
		{
			case Oberon0Parser.PLUS:
				return new InfixAdditionExpression(left, right);
			case Oberon0Parser.MINUS:
				return new InfixSubtractionExpression(left, right);
			case Oberon0Parser.DIVIDE:
				return new InfixDivisionExpression(left, right);
			case Oberon0Parser.TIMES:
				return new InfixMultiplicationExpression(left, right);
			case Oberon0Parser.GREATERTHAN:
				return new InfixGreaterThanExpression(left, right);
			case Oberon0Parser.SMALLERTHAN:
				return new InfixSmallerThanExpression(left, right);
			case Oberon0Parser.GREATEREQUALS:
				return new InfixGreaterEqualsExpression(left, right);
			case Oberon0Parser.SMALLEREQUALS:
				return new InfixSmallerEqualsExpression(left, right);
			case Oberon0Parser.EQUALS:
				return new InfixEqualsExpression(left, right);
			case Oberon0Parser.NOTEQUALS:
				return new InfixNotEqualsExpression(left, right);
			case Oberon0Parser.AND:
				return new InfixAndExpression(left, right);
			case Oberon0Parser.OR:
				return new InfixOrExpression(left, right);
			default:
				throw new UnknownOperatorException(tree.getText());		
		}
	}
	public static IntegerLiteral buildIntegerLiteral(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.INTEGER);
		return new IntegerLiteral(new Integer(java.lang.Integer.parseInt(tree.getText())));
	}
	public static Module buildModule(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.MODULE);
		assert(tree.getChildCount() >= 1);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		Statement body = null;
		List<BodyDeclaration> bodyDeclarations = new Vector<BodyDeclaration>();
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
				case Oberon0Parser.TYPE:
					bodyDeclarations.add(buildBodyDeclaration(child));
					break;
				default:
					throw new ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' in Module on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
			}
		}
		return new Module(bodyDeclarations, body);
	}
	public static Expression buildPrefixExpression(Tree tree) throws Exception
	{
		assert(tree.getChildCount() == 1);
		Expression right = buildExpression(tree.getChild(0));
		switch (tree.getType())
		{
			case Oberon0Parser.MINUS:
				return new PrefixMinExpression(right);
			case Oberon0Parser.NOT:
				return new PrefixNotExpression(right);
			default:
				throw new UnknownOperatorException(tree.getText());		
		}
	}
	public static ProcedureCall buildProcedureCall(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.PROCEDURECALL);
		assert(tree.getChildCount() >= 1);
		String name = tree.getChild(0).getText();
		List<Expression> parameters = new Vector<Expression>();
		if (tree.getChildCount() >= 2)
		{
			for (int i=1;i<tree.getChildCount();i++)
			{
				parameters.add(buildExpression(tree.getChild(i)));
			}
		}
		return new ProcedureCall(name, parameters);
	}
	public static ProcedureDeclaration buildProcedureDeclaration(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.PROCEDURE);
		assert(tree.getChildCount() >= 1);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT);
		String name = tree.getChild(0).getText();
		List<VarDeclaration> parameters = new Vector<VarDeclaration>();
		List<BodyDeclaration> bodyDeclarations = new Vector<BodyDeclaration>();
		Block body = null;
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
				case Oberon0Parser.TYPE:
				case Oberon0Parser.PROCEDURE:
					bodyDeclarations.add(buildBodyDeclaration(child));
					break;
				case Oberon0Parser.BODY:
					body = buildBlock(child);
					break;
			}
		}
		
		return new ProcedureDeclaration(name, parameters, bodyDeclarations, body);
	}
	public static RecordDeclaration buildRecordDeclaration(Tree tree) throws Exception
	{
		String name = tree.getChild(0).getText();
		HashMap<String, String> members = new HashMap<String, String>();
		Tree vars = tree.getChild(1);
		for (int i=0;i<vars.getChildCount();i++)
		{
			members.put(vars.getChild(i).getChild(1).getText(), vars.getChild(i).getChild(0).getText());
		}
		return new RecordDeclaration(name, members);
	}
	public static Selector buildSelector(Tree tree) throws Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.DOTSELECTOR:
				return buildDotSelector(tree);
			case Oberon0Parser.ARRAYSELECTOR:
				return buildArraySelector(tree);
			case Oberon0Parser.IDENT:
				return buildVariableSelector(tree);
			default:
					throw new ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' in Selector on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
	public static Statement buildStatement(Tree tree) throws Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.ASSIGNMENT:
				return buildAssignmentStatement(tree);
			case Oberon0Parser.WHILE:
				return buildWhileStatement(tree);
			case Oberon0Parser.IF:
				return buildIfStatement(tree);
			case Oberon0Parser.PROCEDURECALL:
				return buildProcedureCall(tree);
			default:
				throw new ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' in Statement on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
	public static VarDeclaration buildVarDeclaration(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.VAR || tree.getType() == Oberon0Parser.REFVAR);
		assert(tree.getChildCount() >= 1);
		assert(tree.getChild(0).getType() == Oberon0Parser.IDENT || tree.getChild(0).getType() == Oberon0Parser.ARRAY);
		boolean isReference = false;
		if (tree.getType() == Oberon0Parser.REFVAR)
			isReference = true;
		String type = tree.getChild(0).getText();
		List<String> names = new Vector<String>();
		for (int i=1;i<tree.getChildCount();i++)
		{
			names.add(tree.getChild(i).getText());
		}
		if (type.equals(Type.ARRAY.getTypeText()))
		{
			List<Expression> arrayLength = new LinkedList<Expression>();
			Tree subTree = tree.getChild(0);
			while (subTree.getText().equals(Type.ARRAY.getTypeText()))
			{
				assert(subTree.getType() == Oberon0Parser.ARRAY);
				type = subTree.getChild(0).getChild(0).getText();
				arrayLength.add(buildExpression(subTree.getChild(1).getChild(0)));
				subTree = subTree.getChild(0).getChild(0);
			}
			return new ArrayVarDeclaration(type, isReference, names, arrayLength);
		}
		else
			return new VarDeclaration(type, isReference, names);
	}
	public static VariableSelector buildVariableSelector(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.IDENT);
		String name = tree.getText();
		return new VariableSelector(name);
	}
	public static WhileStatement buildWhileStatement(Tree tree) throws Exception
	{
		assert(tree.getType() == Oberon0Parser.WHILE);
		assert(tree.getChildCount() == 2);
		assert(tree.getChild(0).getType() == Oberon0Parser.EXPRESSION);
		Expression expression = buildExpression(tree.getChild(0).getChild(0));
		Block statement = buildBlock(tree.getChild(1));
		return new WhileStatement(expression, statement);
	}
}
