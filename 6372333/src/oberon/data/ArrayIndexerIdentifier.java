package oberon.data;

import oberon.IDataType;
import oberon.IExpression;
import oberon.IIdentifier;

public class ArrayIndexerIdentifier extends AbstractIdentifier {
	private final IExpression indexExpression;
	private final IIdentifier selector;

	public ArrayIndexerIdentifier(final IIdentifier indexSelector, 
			final IExpression expression){
		indexExpression = expression;
		selector = indexSelector;
	}

	private IntegerArrayDataType getDataTypeAsArrayType() {
		final IDataType type = selector.getDataTypeValue();
		if (!(type instanceof IntegerArrayDataType)) {
			//TODO: throw exception
		}
		
		return ((IntegerArrayDataType)type);
	}

	@Override
	public int getSelectorValue() {
		final IntegerArrayDataType array = getDataTypeAsArrayType();
		return array.getValueAtIndex(indexExpression.evalAsInt());
	}

	@Override
	public IDataType getDataTypeValue() {
		return new IntegerArrayIndexerDataType(getDataTypeAsArrayType(), indexExpression.evalAsInt());
	}

}
