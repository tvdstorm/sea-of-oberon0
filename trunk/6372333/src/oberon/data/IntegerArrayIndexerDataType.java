package oberon.data;

import oberon.IDataType;

public class IntegerArrayIndexerDataType extends AbstractDataType {
	private final IntegerArrayDataType array;
	private final int index;

	public IntegerArrayIndexerDataType(final IntegerArrayDataType inputArray, 
			final int inputIndex) {
		super(inputArray.getName());
		array = inputArray;
		index = inputIndex;
	}
	
	IntegerArrayIndexerDataType(final String name, final IntegerArrayDataType inputArray, 
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
	public IDataType copy(final String newName) {
		return new IntegerArrayIndexerDataType(newName, array, index);
	}
	
	@Override
	public void setValue(final int value){
		array.setValueAtIndex(index, value);
	}
}
