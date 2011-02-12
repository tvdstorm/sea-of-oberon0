package oberon.data;

import oberon.*;
import oberon.exceptions.ProcedureParamaterCountMismatchException;
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
	 * @param currentScope the scope current execution is in
	 *
	 * @return the data type as array type
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	private IntegerArrayDataType getDataTypeAsArrayType(Scope currentScope) {
		IDataType type = selector.getDataTypeValue(currentScope);
		
		if (type instanceof RecordIndexerDataType){
			type = ((RecordIndexerDataType)type).getDataType();
		}
		
		return ((IntegerArrayDataType)type);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) {
		final IntegerArrayDataType array = getDataTypeAsArrayType(currentScope);
		return array.getValueAtIndex(indexExpression.evalAsInt(currentScope));
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getDataTypeValue()
	 */
	@Override
	public IDataType getDataTypeValue(Scope currentScope) {
		return new IntegerArrayIndexerDataType(getDataTypeAsArrayType(currentScope), indexExpression.evalAsInt(currentScope));
	}

}
