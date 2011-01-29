package jdm.oberon0.ast;

public class ArraySelector extends Expression {
	private Expression _base;
	private Expression _index;
	
	public ArraySelector(Expression base, Expression index) {
		_base = base;
		_index = index;
	}
	
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
