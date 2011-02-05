package jdm.oberon0.ast.statements;

import jdm.oberon0.ast.expressions.Expression;

public class Assignment extends Statement {
	protected Expression _lhs;
	protected Expression _rhs;
	
	public Assignment(Expression lhs, Expression rhs) {
		this._lhs = lhs;
		this._rhs = rhs;
	}

	public Expression getLhs() {
		return _lhs;
	}

	public Expression getRhs() {
		return _rhs;
	}

	public void accept(StatementVisitor visitor) {
		visitor.visitAssignment(this);
	}
}
