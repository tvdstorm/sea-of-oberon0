package oberon.data;

import oberon.IDataType;

/**
 * The Class IntegerDataType.
 */
public class IntegerDataType extends AbstractDataType {
	
	/** The value. */
	private int value;
	
	/** Value is a constant. */
	private final Boolean isConstant;

	/**
	 * Instantiates a new integer data type.
	 *
	 * @param name the new name of the instance
	 * @param isConst true if the variable is a constant
	 */
	public IntegerDataType(final String name, final Boolean isConst) {
		super(name);
		isConstant = isConst;
	}

	/**
	 * Instantiates a new integer data type.
	 *
	 * @param name the new name of the instance
	 * @param inputValue the value
	 * @param isConst true if the variable is a constant
	 */
	public IntegerDataType(final String name, final int inputValue, 
			final Boolean isConst) {
		this (name, isConst);
		value = inputValue;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#getValue()
	 */
	@Override
	public int getValue() {
		return value;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#copy(java.lang.String)
	 */
	@Override
	public IDataType copy(final String newName) {
		return new IntegerDataType(newName, value, isConstant);
	}
	
	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#setValue(int)
	 */
	@Override
	public void setValue(final int inputValue){
		value = inputValue;
	}
}
