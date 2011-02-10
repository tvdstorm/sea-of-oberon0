package oberon.data;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.Scope;
import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class RecordIndexerIdentifier, identifier containing a pointer to a specific field in a record.
 */
public class RecordIndexerIdentifier extends AbstractIdentifier {
	
	/** The index. */
	private final String index;
	
	/** The selector. */
	private final IIdentifier selector;

	/**
	 * Instantiates a new record indexer identifier.
	 *
	 * @param recordSelector the underlying record 
	 * @param recordFieldname the specific fieldname
	 */
	public RecordIndexerIdentifier(final IIdentifier recordSelector, 
			final String recordFieldname){
		index = recordFieldname;
		selector = recordSelector;
	}

	/**
	 * Gets the data type as record data type.
	 *
	 * @return the data type as record data type
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public IDataType getDataTypeAsRecordDataType(Scope currentScope) {
		return selector.getDataTypeValue(currentScope);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) {
		return getDataTypeValue(currentScope).getValue(currentScope);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getDataTypeValue()
	 */
	@Override
	public IDataType getDataTypeValue(Scope currentScope) {
		return new RecordIndexerDataType((RecordDataType) selector.getDataTypeValue(currentScope), index);
	}
}
