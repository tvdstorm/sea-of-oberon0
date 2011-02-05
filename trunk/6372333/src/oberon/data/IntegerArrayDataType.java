package oberon.data;

import oberon.IDataType;
import oberon.IExpression;

public class IntegerArrayDataType extends AbstractDataType {
	private int[] array;
	private final IExpression lengthExpression;

	public IntegerArrayDataType(final String name, final IExpression lengthExp){
		super(name);
		lengthExpression = lengthExp;
	}
	
	IntegerArrayDataType(final String name, final int[] inputArray, 
			final IExpression lengthExp) {
		super(name);
		array = inputArray;
		lengthExpression = lengthExp;
	}
	
	public int getValueAtIndex(final int index){
		return array[index];
	}

	public void initializeArray() {
		array = new int[lengthExpression.evalAsInt()];			
	}

	@Override
	public int getValue() {
		System.out.println("getValue() called on IntegerArrayType");
		return 0;
	}

	public void setValueAtIndex(final int index, final int value) {
		array[index] = value;
	}

	@Override
	public IDataType copy(final String newName) {
		return new IntegerArrayDataType(newName, array, lengthExpression);
	}
}