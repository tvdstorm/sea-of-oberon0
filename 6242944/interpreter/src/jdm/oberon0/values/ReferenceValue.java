package jdm.oberon0.values;

import jdm.oberon0.exceptions.InvalidTypeException;
import jdm.oberon0.types.Type;

/**
 * Reference to another value, used to implement assignment to 
 * arrays and arguments passed by reference.
 */
public class ReferenceValue extends Value {
	private Value _value;
	
	public ReferenceValue(Value value) {
		setValue(value);
	}
	public Value getValue() {
		assert !(_value instanceof ReferenceValue);
		return _value;
	}
	
	public void setValue(Value value) {
		// make sure we don't create a reference to a reference
		if (value instanceof ReferenceValue) {
			value = ((ReferenceValue)value).getValue();
		}

		// check this assignment is valid
		if (_value != null && !_value.getType().equals(value.getType())) {
			throw new InvalidTypeException("Invalid assignment to reference");
		}
		
		_value = value;
	}

	@Override
	public String toNativeString() {
		return _value.toNativeString();
	}
	@Override
	public boolean valueEquals(Value other) {
		return _value.valueEquals(other);
	}
	
	@Override
	public IntegerValue toInteger() {
		return _value.toInteger();
	}
	
	@Override
	public BooleanValue toBoolean() {
		return _value.toBoolean();
	}

	@Override
	public ArrayValue toArray() {
		return _value.toArray();
	}
	
	@Override
	public RecordValue toRecord() {
		return _value.toRecord();
	}

	@Override
	public ReferenceValue toReference() {
		return this;
	}

	@Override
	public Type getType() {
		return _value.getType();
	}
	public static ReferenceValue getRef(Value value) {
		if (value instanceof ReferenceValue) {
			return (ReferenceValue)value;
		}
		return new ReferenceValue(value);
	}
	@Override
	public Value clone() {
		return _value.clone();
	}
}
