package runtime;

public class ValueRef {
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
}
