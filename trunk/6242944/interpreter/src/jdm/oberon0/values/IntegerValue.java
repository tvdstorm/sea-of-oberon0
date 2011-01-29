package jdm.oberon0.values;

import jdm.oberon0.types.PrimitiveType;
import jdm.oberon0.types.Type;

public class IntegerValue extends Value {
	private int _value;
	
	public IntegerValue(int value) {
		_value = value;
	}
	
	public int getValue() {
		return _value;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntegerValue other = (IntegerValue) obj;
		if (_value != other._value)
			return false;
		return true;
	}

	@Override
	public String toNativeString() {
		return "" + _value;
	}
	
	@Override
	public IntegerValue toInteger() {
		return this;
	}

	@Override
	public Type getType() {
		return PrimitiveType.Integer;
	}

	@Override
	public boolean valueEquals(Value other) {
		if (other.getType() != PrimitiveType.Integer) {
			return false;
		}
		return (_value == other.toInteger().getValue());
	}

	@Override
	public Value clone() {
		return new IntegerValue(_value);
	}
}
