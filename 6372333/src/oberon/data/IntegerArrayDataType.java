package oberon.data;

import oberon.IDataType;
import oberon.IExpression;
import oberon.Scope;

/**
 * The Class IntegerArrayDataType, stores the value of array instance variables.
 */
public class IntegerArrayDataType extends AbstractDataType {
	
	/** The array. */
	private int[] array;
	
	/** The length expression. */
	private final IExpression lengthExpression;

	/**
	 * Instantiates a new integer array data type.
	 *
	 * @param name the name of the new instance
	 * @param lengthExp the length of the array
	 */
	public IntegerArrayDataType(final String name, final IExpression lengthExp){
		super(name);
		lengthExpression = lengthExp;
	}
	
	/**
	 * Instantiates a new integer array data type.
	 *
	 * @param name the name of the new instance
	 * @param inputArray the array
	 * @param lengthExp the length of the array
	 */
	IntegerArrayDataType(final String name, final int[] inputArray, 
			final IExpression lengthExp) {
		super(name);
		array = inputArray;
		lengthExpression = lengthExp;
	}
	
	/**
	 * Gets the value from the array at the specified index.
	 *
	 * @param index the index
	 * @return the value at index in the array
	 */
	public int getValueAtIndex(final int index){
		return array[index];
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) {
		System.out.println("getValue() called on IntegerArrayType");
		return 0;
	}

	/**
	 * Sets the value at the specified index in the array.
	 *
	 * @param index the index to set the value at
	 * @param value the value to set
	 */
	public void setValueAtIndex(final int index, final int value) {
		array[index] = value;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#copy(java.lang.String)
	 */
	@Override
	public IDataType performDeepCopy(final String newName) {
		return new IntegerArrayDataType(newName, array, lengthExpression);
	}

	@Override
	public void initialize(Scope currentScope) {
		array = new int[lengthExpression.evalAsInt(currentScope)];
	}
	
	
}
