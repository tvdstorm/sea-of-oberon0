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

	@Override
	public int getSelectorValue() {
		final IntegerArrayType array = getDataTypeAsArrayType();
		return array.getValueAtIndex(indexExpression.evalAsInt());
	}

	private IntegerArrayType getDataTypeAsArrayType() {
		final IDataType type = selector.getDataTypeValue();
		if (!(type instanceof IntegerArrayType)) {
			//TODO: throw exception
		}
		
		return ((IntegerArrayType)type);
	}

	@Override
	public IDataType getDataTypeValue() {
		return new IntegerArrayIndexerDataType(getDataTypeAsArrayType(), indexExpression.evalAsInt());
	}

}
