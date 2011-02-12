package oberon.data;

import java.util.Iterator;
import java.util.List;

import oberon.IDataType;
import oberon.IIdentifier;
import oberon.Scope;
import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class RecordIndexerIdentifier, identifier containing a pointer to a specific field in a record.
 */
public class RecordIndexerIdentifier extends AbstractIdentifier {
	
	/** The selector. */
	private final IIdentifier selector;

	private final List<String> subRecords;

	private final String recordFieldname;

	/**
	 * Instantiates a new record indexer identifier.
	 *
	 * @param recordSelector the underlying record 
	 * @param recordFieldname the specific fieldname
	 */
	public RecordIndexerIdentifier(final IIdentifier recordSelector, final List<String> subRecords,
			final String recordFieldname){
		this.subRecords = subRecords;
		selector = recordSelector;
		this.recordFieldname = recordFieldname;
	}

	/**
	 * Gets the data type as record data type.
	 *
	 * @return the data type as record data type
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	private IDataType getDataType(Scope currentScope) {
		IDataType rootRecord = selector.getDataTypeValue(currentScope);
	
		if (rootRecord instanceof RecordDataType){
			RecordDataType record = ((RecordDataType)rootRecord);
			Iterator<String> subrecordIterator = subRecords.iterator();
			
			while (subrecordIterator.hasNext()){
				record = (RecordDataType) record.getValueAtIndex(subrecordIterator.next());
			}
			
			return record;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) {
		IDataType rootRecord = selector.getDataTypeValue(currentScope);
		
		if (rootRecord instanceof RecordDataType){
			RecordDataType record = ((RecordDataType)rootRecord);
			Iterator<String> subrecordIterator = subRecords.iterator();
			
			while (subrecordIterator.hasNext()){
				record = (RecordDataType) record.getValueAtIndex(subrecordIterator.next());
			}
			
			record.getValueAtIndex(recordFieldname).getValue(currentScope);
		}
		else{
			//TODO: throw
			System.out.println("Error in rii");
		}
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractIdentifier#getDataTypeValue()
	 */
	@Override
	public IDataType getDataTypeValue(Scope currentScope) {
		return new RecordIndexerDataType((RecordDataType) getDataType(currentScope), recordFieldname);
	}
}
