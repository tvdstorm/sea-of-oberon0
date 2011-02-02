package oberon.data;

public class IntegerArrayIndexerType extends DataType {

	private IntegerArrayType _array;
	private int _index;

	public IntegerArrayIndexerType(IntegerArrayType array, int index) {
		super(array.getName());
		_array = array;
		_index = index;
	}
	
	IntegerArrayIndexerType(String name, IntegerArrayType array, int index) {
		super(name);
		_array = array;
		_index = index;
	}

	@Override
	public int getValue() {
		return _array.getValueAtIndex(_index);
	}

	@Override
	public DataType DeepCopy(String newName) {
		return new IntegerArrayIndexerType(newName, _array, _index);
	}

	@Override
	public DataType ShallowCopy(String newName) {
		return new IntegerArrayIndexerType(newName, _array, _index);
	}

	public void setValueAtIndex(int value) {
		_array.setValueAtIndex(_index, value);		
	}

}
