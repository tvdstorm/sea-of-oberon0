package randy.oberon0.ast;

public abstract class InfixExpression extends Expression
{
	protected final Expression lhs;
	protected final Expression rhs;
	
	public InfixExpression(Expression _lhs, Expression _rhs)
	{
		assert(_lhs != null);
		assert(_rhs != null);
		lhs = _lhs;
		rhs = _rhs;
	}
}
