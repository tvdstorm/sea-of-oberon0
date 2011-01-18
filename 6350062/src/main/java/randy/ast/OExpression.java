package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;

public abstract class OExpression extends OASTNode
{
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
				return OInfixExpression.buildInfixExpression(tree);
			case Oberon0Parser.INTEGER:
				return OIntegerLiteral.buildIntegerLiteral(tree);
			case Oberon0Parser.PROCEDURECALL:
				return OProcedureCall.buildProcedureCall(tree);
			case Oberon0Parser.IDENT:
				return OVariable.buildVariable(tree);
			case Oberon0Parser.ARRAYSELECTOR:
				return OArraySelector.buildArraySelector(tree);
			default:
				throw new Oberon0ASTTreeBuildException("Encountered unknown parser tree type '" + tree.getType() + "' on line " + tree.getLine() + " column " + tree.getCharPositionInLine() + ".");
		}
	}
}
