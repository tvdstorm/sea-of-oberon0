package runtime;

public class BooleanValue extends Value {
	private boolean _value;
	
	public BooleanValue(boolean value) {
		this._value = value;
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
}
