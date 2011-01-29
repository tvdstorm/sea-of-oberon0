package jdm.oberon0.ast;

public abstract class BinaryExpression extends Expression {
	protected Expression _lhs;
	protected Expression _rhs;
	
	public BinaryExpression(Expression lhs, Expression rhs) {
		this._lhs = lhs;
		this._rhs = rhs;
	}
	
	public Expression getLhs() {
		return _lhs;
	}

	public Expression getRhs() {
		return _rhs;
	}
}
