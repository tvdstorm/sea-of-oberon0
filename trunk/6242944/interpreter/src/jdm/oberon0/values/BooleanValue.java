package jdm.oberon0.values;

import jdm.oberon0.types.PrimitiveType;
import jdm.oberon0.types.Type;

public class BooleanValue extends Value {
	private boolean _value;
	
	public BooleanValue(boolean value) {
		this._value = value;
	}
	
	public boolean getValue() {
		return _value;
	}

	@Override
	public String toNativeString() {
		return "" + _value;
	}

	@Override
	public boolean valueEquals(Value other) {
		if (other.getType() != PrimitiveType.Boolean) {
			return false;
		}
		return _value == other.toBoolean().getValue();
	}
	
	@Override
	public BooleanValue toBoolean() {
		return this;
	}
	
	@Override
	public Type getType() {
		return PrimitiveType.Boolean;
	}

	@Override
	public Value clone() {
		return new BooleanValue(_value);
	}
}
