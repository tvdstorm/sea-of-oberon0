package jdm.oberon0.types;

public class ArrayType implements Type {
	protected ReferenceType _elementType;
	protected int _size;
	
	public ArrayType(ReferenceType elementType, int size) {
		_elementType = elementType;
		_size = size;
	}

	public ReferenceType getElementType() {
		return _elementType;
	}
	
	public int getSize() {
		return _size;
	}
	
	public boolean equals(Type other) {
		if (!(other instanceof ArrayType)) {
			return false;
		}
		ArrayType otherArray = (ArrayType)other;
		
		if (!_elementType.equals(otherArray._elementType)) {
			return false;
		}
		return _size == otherArray._size;
	}
}
