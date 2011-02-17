package jdm.oberon0.ast.statements;

import jdm.oberon0.ast.expressions.Expression;

public class WithStatement extends Statement {
	
	private Expression _value;
	private StatementSequence _body;
	
	public WithStatement(Expression value, StatementSequence body) {
		this._value = value;
		this._body = body;
	}

	public Expression getValue() {
		return _value;
	}

	public StatementSequence getBody() {
		return _body;
	}
	
	@Override
	public void accept(StatementVisitor visitor) {
		visitor.visitWithStatement(this);
	}
}
