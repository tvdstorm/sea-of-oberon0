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
		DataType type = _selector.getDataTypeValue();
		if (!(type instanceof IntegerArrayType))
		{
			//TODO: throw exception
		}
		
		IntegerArrayType array = ((IntegerArrayType)type);
		array.setIndex(_expression.EvalAsInt());
		return array.getValue();
	}

	@Override
	public DataType getDataTypeValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
