package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;
import randy.value.OValue;

public abstract class OExpression extends OASTNode
{
	// TODO: invullen
	public abstract OValue run() throws Oberon0Exception;
	public static OExpression buildExpression(Tree tree) throws Oberon0Exception
	{
		switch (tree.getType())
		{
			case Oberon0Parser.MINUS:
			case Oberon0Parser.PLUS:
			case Oberon0Parser.DIVIDE:
			case Oberon0Parser.TIMES:
				return OInfixExpression.buildInfixExpression(tree);
			case Oberon0Parser.INTEGER:
				return OIntegerLiteral.buildIntegerLiteral(tree);
			case Oberon0Parser.PROCEDURECALL:
				return OProcedureCall.buildProcedureCall(tree);
			default:
				throw new Oberon0Exception("Unknown expression '" + tree.getType() + "'.");
		}
	}
}
