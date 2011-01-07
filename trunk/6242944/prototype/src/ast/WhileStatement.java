package ast;

public class WhileStatement extends Statement {
	
	private Expression _test;
	private StatementSequence _body;
	
	public WhileStatement(Expression test, StatementSequence body) {
		this._test = test;
		this._body = body;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}

	public Expression getTest() {
		return _test;
	}

	public StatementSequence getBody() {
		return _body;
	}

}
