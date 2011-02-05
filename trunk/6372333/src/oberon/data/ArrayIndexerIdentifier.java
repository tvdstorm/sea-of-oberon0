package oberon.data;

import oberon.IExpression;

public class ArrayIndexerIdentifier extends AbstractIdentifier {
	private final IExpression indexExpression;
	private final AbstractIdentifier selector;

	public ArrayIndexerIdentifier(final AbstractIdentifier indexSelector, 
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
		return new IntegerArrayIndexerDataType(getDataTypeAsArrayType(), indexExpression.evalAsInt());
	}

}
