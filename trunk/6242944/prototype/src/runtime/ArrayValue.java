package runtime;

public class ArrayValue extends Value {
	private ValueRef[] _values;
	
	public ArrayValue(ValueRef[] values) {
		_values = values;
	}
	
	@Override
	public IntegerValue toInteger() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BooleanValue toBoolean() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean isArray() {
		return true;
	}

	@Override
	public String toNativeString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<_values.length; i++) {
			if (i > 0) {
				sb.append(", ");
			}
			sb.append(_values[i].toNativeString());
		}
		sb.append("]");
		return sb.toString();
	}

	public Value getValueAt(int index) {
		if (index < _values.length) {
			return _values[index];
		}
		//XXX
		return null;
	}

	@Override
	public ArrayValue toArray() {
		return this;
	}

	@Override
	public boolean valueEquals(Value other) {
		// TODO Auto-generated method stub
		return false;
	}

}
