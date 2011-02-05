package oberon.data;

import oberon.IExpression;

public class ArrayIndexerSelector extends AbstractSelector {
	private final IExpression indexExpression;
	private final AbstractSelector selector;

	public ArrayIndexerSelector(final AbstractSelector indexSelector, 
			final IExpression expression){
		indexExpression = expression;
		selector = indexSelector;
	}

	@Override
	public int getSelectorValue() {
		final IntegerArrayType array = getDataTypeAsArrayType();
		return array.getValueAtIndex(indexExpression.evalAsInt());
	}

	private IntegerArrayType getDataTypeAsArrayType() {
		final AbstractDataType type = selector.getDataTypeValue();
		if (!(type instanceof IntegerArrayType)) {
			//TODO: throw exception
		}
		
		return ((IntegerArrayType)type);
	}

	@Override
	public AbstractDataType getDataTypeValue() {
		return new IntegerArrayIndexerType(getDataTypeAsArrayType(), indexExpression.evalAsInt());
	}

}
