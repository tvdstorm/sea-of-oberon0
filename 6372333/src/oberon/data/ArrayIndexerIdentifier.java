package oberon.data;

import oberon.IDataType;
import oberon.IExpression;
import oberon.IIdentifier;
import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

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
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	private IntegerArrayDataType getDataTypeAsArrayType() throws UnsupportedException, VariableNotFoundInScopeException {
		final IDataType type = selector.getDataTypeValue();
		
		//type should always be an array
		assert(type instanceof IntegerArrayDataType);
		
		return ((IntegerArrayDataType)type);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getValue()
	 */
	@Override
	public int getValue() throws UnsupportedException, VariableNotFoundInScopeException {
		final IntegerArrayDataType array = getDataTypeAsArrayType();
		return array.getValueAtIndex(indexExpression.evalAsInt());
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getDataTypeValue()
	 */
	@Override
	public IDataType getDataTypeValue() throws UnsupportedException, VariableNotFoundInScopeException {
		return new IntegerArrayIndexerDataType(getDataTypeAsArrayType(), indexExpression.evalAsInt());
	}

}
