package oberon0.environment;

/*
 * A Reference is like a pointer in c, 
 * allows arrays, records and calls-by-reference
 */
public class Reference {
	private IValue _value;

	public Reference(IValue value) {
		_value = value.getCopy();
	}

	public IValue getValue() {
		return (IValue) _value;
	}

	public void setValue(IValue value) {
		_value = value;
	}

	public String toString() {
		return _value.toString();
	}

	public Reference getCopy() {
		return new Reference(_value.getCopy());
	}
}
