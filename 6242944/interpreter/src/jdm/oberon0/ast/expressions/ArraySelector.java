package jdm.oberon0.ast.expressions;


public class ArraySelector extends Expression {
	private Expression _base;
	private Expression _index;
	
	public ArraySelector(Expression base, Expression index) {
		_base = base;
		_index = index;
	}
	
	public Expression getBase() {
		return _base;
	}

	public Expression getIndex() {
		return _index;
	}

	public <T> T accept(ExpressionVisitor<T> visitor) {
		return visitor.visitArraySelector(this);
	}
}
