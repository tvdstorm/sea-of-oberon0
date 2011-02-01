package oberon.data;

import oberon.Expression;

public class ArrayIndexerSelector extends Selector {
	private Expression _expression;
	private Selector _selector;

	public ArrayIndexerSelector(Selector selector, Expression expression){
		_expression = expression;
		_selector = selector;
	}

	@Override
	public int getSelectorValue() {
		IntegerArrayType array = getDataTypeAsArrayType();
		array.setIndex(_expression.EvalAsInt());
		return array.getValue();
	}

	private IntegerArrayType getDataTypeAsArrayType() {
		DataType type = _selector.getDataTypeValue();
		if (!(type instanceof IntegerArrayType))
		{
			//TODO: throw exception
		}
		
		IntegerArrayType array = ((IntegerArrayType)type);
		return array;
	}

	@Override
	public DataType getDataTypeValue() {
		return new IntegerArrayIndexerType(getDataTypeAsArrayType(), _expression.EvalAsInt());
	}

}
