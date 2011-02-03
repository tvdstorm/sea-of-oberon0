package oberon.data;

public class IntegerArrayIndexerType extends AbstractDataType {

	private final IntegerArrayType array;
	private final int index;

	public IntegerArrayIndexerType(final IntegerArrayType inputArray, 
			final int inputIndex) {
		super(inputArray.getName());
		array = inputArray;
		index = inputIndex;
	}
	
	IntegerArrayIndexerType(final String name, final IntegerArrayType inputArray, 
			final int inputIndex) {
		super(name);
		array = inputArray;
		index = inputIndex;
	}

	@Override
	public int getValue() {
		return array.getValueAtIndex(index);
	}

	@Override
	public AbstractDataType deepCopy(final String newName) {
		return new IntegerArrayIndexerType(newName, array, index);
	}

	@Override
	public AbstractDataType shallowCopy(final String newName) {
		return new IntegerArrayIndexerType(newName, array, index);
	}
	
	@Override
	public void setValue(final int value){
		array.setValueAtIndex(index, value);
	}
}
