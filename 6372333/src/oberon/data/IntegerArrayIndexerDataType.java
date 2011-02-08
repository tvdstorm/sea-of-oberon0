package oberon.data;

import oberon.IDataType;
import oberon.Scope;

/**
 * The Class IntegerArrayIndexerDataType, stores the value of a specific index in an array.
 */
public class IntegerArrayIndexerDataType extends AbstractDataType {
	
	/** The array. */
	private final IntegerArrayDataType array;
	
	/** The index. */
	private final int index;

	/**
	 * Instantiates a new integer array indexer data type.
	 *
	 * @param inputArray the underlying array
	 * @param inputIndex the index
	 */
	public IntegerArrayIndexerDataType(final IntegerArrayDataType inputArray, 
			final int inputIndex) {
		super(inputArray.getName());
		array = inputArray;
		index = inputIndex;
	}
	
	/**
	 * Instantiates a new integer array indexer data type.
	 *
	 * @param name the name
	 * @param inputArray the underlying array
	 * @param inputIndex the index
	 */
	IntegerArrayIndexerDataType(final String name, final IntegerArrayDataType inputArray, 
			final int inputIndex) {
		super(name);
		array = inputArray;
		index = inputIndex;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) {
		return array.getValueAtIndex(index);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#copy(java.lang.String)
	 */
	@Override
	public IDataType performDeepCopy(final String newName) {
		return new IntegerArrayIndexerDataType(newName, array, index);
	}
	
	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#setValue(int)
	 */
	@Override
	public void setValue(final int value){
		array.setValueAtIndex(index, value);
	}
}
