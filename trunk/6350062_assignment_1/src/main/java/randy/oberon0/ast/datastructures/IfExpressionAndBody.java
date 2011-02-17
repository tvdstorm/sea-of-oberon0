package randy.oberon0.ast.datastructures;

import randy.oberon0.ast.*;

public class IfExpressionAndBody
{
	private final Expression expression;
	private final Block body;
	
	public IfExpressionAndBody(Expression _expression, Block _body)
	{
		assert(_expression != null);
		assert(_body != null);
		expression = _expression;
		body = _body;
	}
	public Expression getExpression()
	{
		return expression;
	}
	public Block getBody()
	{
		return body;
	}
}
