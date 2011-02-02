package randy.oberon0.ast;

public abstract class InfixExpression extends Expression
{
	protected final Expression leftHandExpression;
	protected final Expression rightHandExpression;
	
	public InfixExpression(Expression _leftHandExpression, Expression _rightHandExpression)
	{
		assert(_leftHandExpression != null);
		assert(_rightHandExpression != null);
		leftHandExpression = _leftHandExpression;
		rightHandExpression = _rightHandExpression;
	}
}
