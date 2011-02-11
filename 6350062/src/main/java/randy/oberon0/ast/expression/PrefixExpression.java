package randy.oberon0.ast.expression;

public abstract class PrefixExpression extends Expression
{
	private final Expression rightHandExpression;
	
	protected PrefixExpression(Expression _rightHandExpression)
	{
		assert(_rightHandExpression != null);
		rightHandExpression = _rightHandExpression;
	}
	protected Expression getRightHandExpression()
	{
		return rightHandExpression;
	}
}
