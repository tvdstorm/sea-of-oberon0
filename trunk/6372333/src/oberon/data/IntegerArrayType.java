package oberon.data;

import oberon.Expression;

public class IntegerArrayType extends DataType {
	
	private int _index = -1;
	private int[] _value;
	private boolean _isInitialized;
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
	
	public void setIndex(int index)
	{
		_index = index;
	}
	
	public void setValue(int index, int value)
	{
		initializeArrayIfNeeded();
		_value[index] = value;
	}

	private void initializeArrayIfNeeded() {
		if (!_isInitialized)
		{
			_isInitialized = true;
			_value = new int[_lengthExpression.EvalAsInt()];			
		}
	}

	@Override
	public int getValue() {
		initializeArrayIfNeeded();
		return _value[_index];
	}

	public void setValueAtIndex(int index, int value) {
		_value[index] = value;
	}

	@Override
	public DataType DeepCopy(String newName) {
		initializeArrayIfNeeded();
		return new IntegerArrayType(newName, _value.clone(), _lengthExpression);
	}

	@Override
	public DataType ShallowCopy(String newName) {
		initializeArrayIfNeeded();
		return new IntegerArrayType(newName, _value, _lengthExpression);
	}

}
