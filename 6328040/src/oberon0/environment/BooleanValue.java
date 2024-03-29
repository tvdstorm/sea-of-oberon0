package oberon0.environment;

public class BooleanValue implements IValue {
	private final boolean _value;

	public BooleanValue(boolean value) {
		_value = value;
	}

	public boolean getValue() {
		return _value;
	}

	public static BooleanValue getDefaultValue() {
		return new BooleanValue(false);
	}

	@Override
	public String toString() {
		return Boolean.toString(_value);
	}

	@Override
	public IValue getCopy() {
		return new BooleanValue(_value);
	}
}
