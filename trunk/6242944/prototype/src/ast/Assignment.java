package ast;

public class Assignment extends Statement {
	protected String _lhs;
	protected Expression _rhs;
	
	public Assignment(String lhs, Expression rhs) {
		this._lhs = lhs;
		this._rhs = rhs;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public String getLhs() {
		return _lhs;
	}

	public Expression getRhs() {
		return _rhs;
	}
}
