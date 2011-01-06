package ast;

public class IfStatement extends Statement {
	private Expression _test;
	private StatementSequence _then;
	
	public IfStatement(Expression test, StatementSequence then) {
		this._test = test;
		this._then = then;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Expression getTest() {
		return _test;
	}

	public StatementSequence getThen() {
		return _then;
	}

}
