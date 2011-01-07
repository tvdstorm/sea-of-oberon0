package ast;

public class IfStatement extends Statement {
	private Expression _test;
	private StatementSequence _then;
	private Node _else; //FIXME
	
	public IfStatement(Expression test, StatementSequence then, Node else_) {
		this._test = test;
		this._then = then;
		this._else = else_;
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

	public Node getElse() {
		return _else;
	}
}
