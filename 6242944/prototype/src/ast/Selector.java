package ast;

public class Selector extends Expression {
	private Expression _base;
	private Expression _index;
	
	public Selector(Expression base, Expression index) {
		_base = base;
		_index = index;
	}
	
	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}

	public Expression getBase() {
		return _base;
	}

	public Expression getIndex() {
		return _index;
	}

}
