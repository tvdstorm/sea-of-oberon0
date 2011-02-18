package randy.oberon0.ast.expression;

public abstract class InfixExpression extends Expression
{
	private final Expression leftHandExpression;
	private final Expression rightHandExpression;
	
	protected InfixExpression(Expression _leftHandExpression, Expression _rightHandExpression)
	{
		assert(_leftHandExpression != null);
		assert(_rightHandExpression != null);
		leftHandExpression = _leftHandExpression;
		rightHandExpression = _rightHandExpression;
	}
	protected Expression getLeftHandExpression()
	{
		return leftHandExpression;
	}
	protected Expression getRightHandExpression()
	{
		return rightHandExpression;
	}
}
