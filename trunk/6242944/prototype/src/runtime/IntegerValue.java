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

	@Override
	public boolean valueEquals(Value other) {
		if (!other.isInteger())
			return false;
		int val = other.toInteger().getValue();
		return _value == val;
	}
}
