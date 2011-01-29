package jdm.oberon0.ast;

public class Array extends AbstractType {
	private Expression _size;
	private AbstractType _elementType;
	
	public Array(Expression size, AbstractType elementType) {
		_size = size;
		_elementType = elementType;
	}
	
	public Expression getSize() {
		return _size;
	}
	
	public AbstractType getElementType() {
		return _elementType;
	}
}
