package randy.ast;

import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.OValue;

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
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		return expression.run(vars);
	}
}
