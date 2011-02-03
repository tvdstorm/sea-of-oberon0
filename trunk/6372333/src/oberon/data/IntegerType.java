package oberon.data;

public class IntegerType extends AbstractDataType {
	private int value;
	private final Boolean isConstant;

	public IntegerType(final String name, final Boolean isConst) {
		super(name);
		isConstant = isConst;
	}

	public IntegerType(final String name, final int inputValue, 
			final Boolean isConst) {
		this (name, isConst);
		value = inputValue;
	}

	@Override
	public int getValue() {
		return value;
	}

	@Override
	public AbstractDataType deepCopy(final String newName) {
		return new IntegerType(newName, value, isConstant);
	}

	@Override
	public AbstractDataType shallowCopy(final String newName) {
		return new IntegerType(newName, value, isConstant);
	}

	@Override
	public void setValue(final int inputValue){
		value = inputValue;
	}
}
