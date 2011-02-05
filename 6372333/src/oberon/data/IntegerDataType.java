package oberon.data;

import oberon.IDataType;

public class IntegerDataType extends AbstractDataType {
	private int value;
	private final Boolean isConstant;

	public IntegerDataType(final String name, final Boolean isConst) {
		super(name);
		isConstant = isConst;
	}

	public IntegerDataType(final String name, final int inputValue, 
			final Boolean isConst) {
		this (name, isConst);
		value = inputValue;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public IDataType copy(final String newName) {
		return new IntegerDataType(newName, value, isConstant);
	}
	
	@Override
	public void setValue(final int inputValue){
		value = inputValue;
	}
}
