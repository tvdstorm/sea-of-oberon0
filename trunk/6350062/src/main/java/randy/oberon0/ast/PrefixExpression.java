package randy.oberon0.ast;

public abstract class PrefixExpression extends Expression
{
	protected final Expression rightHandExpression;
	
	public PrefixExpression(Expression _rightHandExpression)
	{
		assert(_rightHandExpression != null);
		rightHandExpression = _rightHandExpression;
	}
}
