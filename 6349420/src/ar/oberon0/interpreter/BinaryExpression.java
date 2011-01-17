package ar.oberon0.interpreter;

public abstract class BinaryExpression extends BaseExpression
{
	private Interpretable _leftExpression;
	private Interpretable _rightExpression;
	
	protected Interpretable getLeftExpression()
	{
		return _leftExpression;
	}
	
	protected Interpretable getRightExpression()
	{
		return _rightExpression;
	}
	
	protected BinaryExpression(Interpretable leftExpression, Interpretable rightExpression)
	{
		_leftExpression = leftExpression;
		_rightExpression = rightExpression;
	}
}
