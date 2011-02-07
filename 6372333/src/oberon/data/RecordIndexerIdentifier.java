package oberon.data;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.Scope;
import oberon.exceptions.UnsupportedException;
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
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	private RecordDataType getDataTypeAsRecordDataType(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException {
		final IDataType type = selector.getDataTypeValue(currentScope);
		
		//type should always be a recorddatatype
		assert(type instanceof RecordDataType);
		
		
		return ((RecordDataType)type);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException {
		final RecordDataType record = getDataTypeAsRecordDataType(currentScope);
		return record.getValueAtIndex(index);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getDataTypeValue()
	 */
	@Override
	public IDataType getDataTypeValue(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException {
		return new RecordIndexerDataType(getDataTypeAsRecordDataType(currentScope), index);
	}
}
