package jdm.oberon0.ast;

public class IfStatement extends Statement {
	private Expression _test;
	private StatementSequence _then;
	private Statement _else;
	
	public IfStatement(Expression test, StatementSequence then, Statement else_) {
		this._test = test;
		this._then = then;
		this._else = else_;
	}

	public Expression getTest() {
		return _test;
	}

	public StatementSequence getThen() {
		return _then;
	}

	public Statement getElse() {
		return _else;
	}
	
	@Override
	public <T> void accept(Visitor<T> visitor) {
		visitor.visitIf(this);
	}
}
