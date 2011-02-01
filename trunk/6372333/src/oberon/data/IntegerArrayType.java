package oberon.data;

public class IntegerArrayType extends DataType {
	
	private int _index = -1;
	private int[] _value = new int[0];

	public IntegerArrayType(String name) {
		super(name);
	}
	
	IntegerArrayType(String name, int[] value) {
		super(name);
		_value = value;
	}
	
	public void setValue(int[] value)
	{
		_value = value;
	}
	
	public void setIndex(int index)
	{
		_index = index;
	}

	@Override
	public int getValue() {
		return _value[_index];
	}

	@Override
	public DataType DeepCopy() {
		return new IntegerArrayType(getName(), _value);
	}

	public void setValueAtIndex(int index, int value) {
		_value[index] = value;
	}

}
