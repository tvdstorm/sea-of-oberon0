package oberon.data;

import oberon.IDataType;
import oberon.IExpression;
import oberon.IIdentifier;

/**
 * The Class ArrayIndexerIdentifier, handles calls to the index of an array.
 */
public class ArrayIndexerIdentifier extends AbstractIdentifier {
	
	/** The index expression. */
	private final IExpression indexExpression;
	
	/** The selector. */
	private final IIdentifier selector;

	/**
	 * Instantiates a new array indexer identifier.
	 *
	 * @param indexSelector the selector of the corresponding array
	 * @param expression the index expression
	 */
	public ArrayIndexerIdentifier(final IIdentifier indexSelector, 
			final IExpression expression){
		indexExpression = expression;
		selector = indexSelector;
	}

	/**
	 * Gets the data type as array type.
	 *
	 * @return the data type as array type
	 */
	private IntegerArrayDataType getDataTypeAsArrayType() {
		final IDataType type = selector.getDataTypeValue();
		if (!(type instanceof IntegerArrayDataType)) {
			//TODO: throw exception
		}
		
		return ((IntegerArrayDataType)type);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getValue()
	 */
	@Override
	public int getValue() {
		final IntegerArrayDataType array = getDataTypeAsArrayType();
		return array.getValueAtIndex(indexExpression.evalAsInt());
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getDataTypeValue()
	 */
	@Override
	public IDataType getDataTypeValue() {
		return new IntegerArrayIndexerDataType(getDataTypeAsArrayType(), indexExpression.evalAsInt());
	}

}
