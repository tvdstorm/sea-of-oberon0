package runtime;

public class BooleanValue extends Value {
	private boolean _value;
	
	public BooleanValue(boolean value) {
		this._value = value;
	}
	
	public boolean getValue() {
		return _value;
	}

	@Override
	public IntegerValue toInteger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toNativeString() {
		return "" + _value;
	}

	@Override
	public BooleanValue toBoolean() {
		return this;
	}
	
	@Override
	public boolean isBoolean() {
		return true;
	}

}
