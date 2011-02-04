package eu.wietsevenema.lang.oberon.ast.expressions;

public class ArraySelector extends Selector {

	private Expression left;
	private Expression index;

	public ArraySelector(Expression left, Expression index) {
		this.left = left;
		this.index = index;
	}

	public Expression getLeft() {
		return left;
	}

	public Expression getIndex() {
		return index;
	}
	
}
