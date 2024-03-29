package oberon.data;

import oberon.IDataType;
import oberon.Scope;

/**
 * The Class RecordIndexerDataType, stores a identifier to a specific field in a record.
 */
public class RecordIndexerDataType extends AbstractDataType {

	/** The fieldName. */
	private final String fieldName;
	
	/** The record. */
	private final RecordDataType record;

	/**
	 * Instantiates a new record indexer data type.
	 *
	 * @param inputName the new name of the instance
	 * @param inputRecord the underlying record
	 * @param inputFieldname the input fieldname
	 */
	public RecordIndexerDataType(final String inputName, final RecordDataType inputRecord, 
			final String inputFieldname) {
		super(inputName);
		fieldName = inputFieldname;
		record = inputRecord;
	}

	/**
	 * Instantiates a new record indexer data type.
	 *
	 * @param recordDataType the underlying record data type
	 * @param inputFieldname the fieldname
	 */
	public RecordIndexerDataType(final RecordDataType recordDataType,
			final String inputFieldname) {
		super(recordDataType.getName());
		record = recordDataType;
		fieldName = inputFieldname;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) {
		return getDataType().getValue(currentScope);			
	}
	
	public IDataType getDataType() {
		return record.getValueAtIndex(fieldName);
	}

	@Override
	public void setValue(int value) {
		if (record instanceof RecordDataType){
			((RecordDataType)record).setValueAtIndex(fieldName, value);
		}
		else{
			record.setValue(value);
		}
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#copy(java.lang.String)
	 */
	@Override
	public IDataType performDeepCopy(final String newName) {
		return new RecordIndexerDataType(newName, record, fieldName);
	}

}
