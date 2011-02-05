package oberon.data;

public class IntegerArrayIndexerDataType extends AbstractDataType {

	private final IntegerArrayType array;
	private final int index;

	public IntegerArrayIndexerDataType(final IntegerArrayType inputArray, 
			final int inputIndex) {
		super(inputArray.getName());
		array = inputArray;
		index = inputIndex;
	}
	
	IntegerArrayIndexerDataType(final String name, final IntegerArrayType inputArray, 
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
		return new IntegerArrayIndexerDataType(newName, array, index);
	}

	@Override
	public AbstractDataType shallowCopy(final String newName) {
		return new IntegerArrayIndexerDataType(newName, array, index);
	}
	
	@Override
	public void setValue(final int value){
		array.setValueAtIndex(index, value);
	}
}