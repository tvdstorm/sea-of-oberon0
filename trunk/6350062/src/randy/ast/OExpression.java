package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;
import randy.grammar.Oberon0Parser;
import randy.value.OValue;

public abstract class OExpression extends OASTNode
{
	// TODO: invullen
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
				throw new Oberon0Exception("Unknown expression '" + tree.getType() + "'.");
		}
	}
}
