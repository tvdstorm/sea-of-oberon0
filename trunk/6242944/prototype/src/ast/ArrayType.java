package ast;

public class ArrayType extends Type {
	private Expression _size;
	private Type _elementType;
	
	public ArrayType(Expression size, Type elementType) {
		_size = size;
		_elementType = elementType;
	}
	
	public Expression getSize() {
		return _size;
	}
	
	public Type getElementType() {
		return _elementType;
	}

	@Override
	public <T> T accept(Visitor<T> visitor) {
		return visitor.visit(this);
	}
}
