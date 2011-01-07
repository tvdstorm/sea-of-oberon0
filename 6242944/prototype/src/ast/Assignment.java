package ast;

public class Assignment extends Statement {
	protected Expression _lhs;
	protected Expression _rhs;
	
	public Assignment(Expression lhs, Expression rhs) {
		this._lhs = lhs;
		this._rhs = rhs;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Expression getLhs() {
		return _lhs;
	}

	public Expression getRhs() {
		return _rhs;
	}
}
