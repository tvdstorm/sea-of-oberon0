package oberon.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oberon.IDataType;
import oberon.Scope;

/**
 * The Class RecordDataType, stores an instance of a record.
 */
public class RecordDataType extends AbstractDataType {
	
	/** The field values. */
	private Map<String, Integer> fieldValues;
	
	/**
	 * Instantiates a new record data type.
	 *
	 * @param inputName the name of the new instance
	 * @param fieldNames the field names of the record
	 */
	public RecordDataType(final String inputName, final List<String> fieldNames) {
		super(inputName);
		
		fieldValues = new HashMap<String, Integer>();
		
		if (fieldNames != null) {
			for (String name : fieldNames) {
				fieldValues.put(name, 0);
			}
		}
	}
	
	/**
	 * Instantiates a new record data type.
	 *
	 * @param inputName the name of the new instance
	 * @param inputFields map with the field values
	 */	
	RecordDataType(final String inputName, final Map<String, Integer> inputFields) {
		super(inputName);
		fieldValues = inputFields;
	}
	
	/**
	 * Gets the value at the specified fieldname.
	 *
	 * @param fieldName the fieldname to get the value for
	 * @return the value at the specified fieldname
	 */
	public int getValueAtIndex(final String fieldName){
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
	public IDataType copy(final String newName) {
		return new RecordDataType(getName(), fieldValues);
	}

}
