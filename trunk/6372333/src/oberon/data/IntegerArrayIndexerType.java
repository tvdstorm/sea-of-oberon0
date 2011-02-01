package oberon.data;

public class IntegerArrayIndexerType extends DataType {

	private IntegerArrayType _array;

	public IntegerArrayIndexerType(IntegerArrayType array, int index) {
		super(array.getName());
		_array = array;
		_array.setIndex(index);
	}
	
	IntegerArrayIndexerType(String name, IntegerArrayType array) {
		super(name);
		_array = array;
	}

	@Override
	public int getValue() {
		return _array.getValue();
	}

	@Override
	public DataType DeepCopy(String newName) {
		return new IntegerArrayIndexerType(newName, _array);
	}

	@Override
	public DataType ShallowCopy(String newName) {
		return new IntegerArrayIndexerType(newName, _array);
	}

}
