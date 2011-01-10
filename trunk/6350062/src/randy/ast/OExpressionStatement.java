package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.Oberon0Exception;

public class OExpressionStatement extends OStatement
{
	private OExpression expression;
	
	public OExpressionStatement(OExpression _expression)
	{
		expression = _expression;
	}
	public static OExpressionStatement buildExpressionStatement(Tree tree) throws Oberon0Exception
	{
		return new OExpressionStatement(OExpression.buildExpression(tree.getChild(0)));
	}
	public void print(String indent)
	{
		expression.print(indent);
	}
}
