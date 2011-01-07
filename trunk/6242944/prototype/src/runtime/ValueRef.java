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
		_value = value;
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
	public String toNativeString() {
		return _value.toNativeString();
	}
}
