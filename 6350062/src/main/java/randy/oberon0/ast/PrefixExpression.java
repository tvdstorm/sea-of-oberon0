package randy.oberon0.ast;

public abstract class PrefixExpression extends Expression
{
	protected final Expression rhs;
	
	public PrefixExpression(Expression _rhs)
	{
		assert(_rhs != null);
		rhs = _rhs;
	}
}
