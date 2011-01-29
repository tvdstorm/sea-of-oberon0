package jdm.oberon0.values;

import jdm.oberon0.exceptions.InvalidIndexException;
import jdm.oberon0.types.ArrayType;
import jdm.oberon0.types.Type;

public class ArrayValue extends Value {
	private ReferenceValue[] _values;
	private ArrayType _type;
	
	public ArrayValue(jdm.oberon0.types.ArrayType type) {
		int size = type.getSize();
		_values = new ReferenceValue[size];
		
		for(int i=0; i<size; i++) {
			_values[i] = ReferenceValue.getRef(Value.fromType(type.getElementType()));
		}
		_type = type;
	}

	@Override
	public String toNativeString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<_values.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(_values[i].toNativeString());
		}
		sb.append("]");
		return sb.toString();
	}

	public ReferenceValue getValueAt(int index) {
		if (index >= _values.length) {
			throw new InvalidIndexException(index);
		}
		return _values[index];
	}

	@Override
	public boolean valueEquals(Value other) {
		if (!getType().equals(other.getType())) {
			return false;
		}
		ArrayValue arrayOther = other.toArray();
		return _values.equals(arrayOther._values);
	}

	@Override
	public Type getType() {
		return _type;
	}

	public ArrayValue toArray() {
		return this;
	}

	@Override
	public Value clone() {
		ArrayValue value = new ArrayValue(_type);
		
		for(int i=0; i<_values.length; i++) {
			value.getValueAt(i).setValue(_values[i].clone());
		}
		return value;
	}
}
