package jdm.oberon0.ast;

public class WhileStatement extends Statement {
	
	private Expression _test;
	private StatementSequence _body;
	
	public WhileStatement(Expression test, StatementSequence body) {
		this._test = test;
		this._body = body;
	}

	public Expression getTest() {
		return _test;
	}

	public StatementSequence getBody() {
		return _body;
	}
	
	@Override
	public <T> void accept(Visitor<T> visitor) {
		visitor.visitWhileStatement(this);
	}
}
