package oberon.data;

import oberon.Expression;

public class IntegerArrayType extends DataType {
	
	private int[] _value;
	private Expression _lengthExpression;

	public IntegerArrayType(String name, Expression lengthExpression){
		super(name);
		_lengthExpression = lengthExpression;
	}
	
	IntegerArrayType(String name, int[] value, Expression lengthExpression) {
		super(name);
		_value = value;
		_lengthExpression = lengthExpression;
	}
	
	public int getValueAtIndex(int index){
		return _value[index];
	}
	
	public void setValue(int index, int value)
	{
		_value[index] = value;
	}

	public void initializeArray() {
		_value = new int[_lengthExpression.EvalAsInt()];			
	}

	@Override
	public int getValue() {
		System.out.println("getValue() called on IntegerArrayType");
		return 0;
	}

	public void setValueAtIndex(int index, int value) {
		_value[index] = value;
	}

	@Override
	public DataType DeepCopy(String newName) {
		return new IntegerArrayType(newName, _value.clone(), _lengthExpression);
	}

	@Override
	public DataType ShallowCopy(String newName) {
		return new IntegerArrayType(newName, _value, _lengthExpression);
	}

}
