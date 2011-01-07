package runtime;

public class IntegerValue extends Value {
	private int _value;
	
	public IntegerValue(int value) {
		_value = value;
	}
	
	public int getValue() {
		return _value;
	}
	
	@Override
	public boolean isInteger() {
		return true; //FIXME: alternative design?
	}

	@Override
	public IntegerValue toInteger() {
		return this;
	}

	@Override
	public String toNativeString() {
		return "" + _value;
	}

	@Override
	public BooleanValue toBoolean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayValue toArray() {
		// TODO Auto-generated method stub
		return null;
	}
}
