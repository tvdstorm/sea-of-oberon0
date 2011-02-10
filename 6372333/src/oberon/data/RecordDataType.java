package oberon.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import oberon.IDataType;
import oberon.Scope;
import oberon.convert.RecordTypeConverter;

/**
 * The Class RecordDataType, stores an instance of a record.
 */
public class RecordDataType extends AbstractDataType {
	
	/** The field values. */
	private Map<String, IDataType> fieldValues;
	private final IDataType parentRecord;
	
	/**
	 * Instantiates a new record data type.
	 *
	 * @param inputName the name of the new instance
	 * @param iDataType 
	 * @param fieldNames the field names of the record
	 */
	public RecordDataType(final String inputName, final HashMap<String, IDataType> values, 
			IDataType parentRecord) {
		super(inputName);
		this.parentRecord = parentRecord;
		
		fieldValues = new HashMap<String, IDataType>();
		
		if (values != null) {
			for (Entry<String, IDataType> valueSet : values.entrySet()) {
				fieldValues.put(valueSet.getKey(), valueSet.getValue());
			}
		}
	}
	
	/**
	 * Instantiates a new record data type.
	 *
	 * @param inputName the name of the new instance
	 * @param inputFields map with the field values
	 */	
	RecordDataType(final String inputName, final Map<String, IDataType> inputFields, 
			IDataType parentRecord) {
		super(inputName);
		fieldValues = inputFields;
		this.parentRecord = parentRecord;
	}
	
	/**
	 * Gets the value at index.
	 *
	 * @param fieldName the field name
	 * @return the value at index
	 */
	public IDataType getValueAtIndex(final String fieldName){
		return fieldValues.get(fieldName);
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#getValue()
	 */
	@Override
	public int getValue(Scope currentScope) {
		System.out.println("getValue() called on IntegerArrayType");
		return 0;
	}

	/* (non-Javadoc)
	 * @see oberon.data.AbstractDataType#copy(java.lang.String)
	 */
	@Override
	public IDataType performDeepCopy(final String newName) {
		return new RecordDataType(getName(), fieldValues, parentRecord);
	}

}
