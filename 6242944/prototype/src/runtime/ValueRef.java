package runtime;

//FIXME: think harder about alternative designs
public class ValueRef extends Value {
	private Value _value;
	
	public ValueRef(Value value) {
		_value = value;
	}
	public Value getValue() {
		return _value;
	}
	
	public void setValue(Value value) {
		if (value instanceof ValueRef) {
			value = ((ValueRef)value).getValue();
		}
		_value = value;
	}

	@Override
	public IntegerValue toInteger() {
		return _value.toInteger();
	}

	@Override	
	public boolean isInteger() {
		return _value.isInteger();
	}
	
	@Override
	public boolean isArray() {
		return _value.isArray();
	}


	@Override	
	public boolean isBoolean() {
		return _value.isBoolean();
	}
	
	@Override
	public BooleanValue toBoolean() {
		return _value.toBoolean();
	}

	@Override
	public String toNativeString() {
		return _value.toNativeString();
	}
	@Override
	public ArrayValue toArray() {
		return _value.toArray();
	}
	@Override
	public boolean valueEquals(Value other) {
		return _value.valueEquals(other);
	}
}
