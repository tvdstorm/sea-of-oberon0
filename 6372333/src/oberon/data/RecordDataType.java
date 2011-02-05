package oberon.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oberon.IDataType;

public class RecordDataType extends AbstractDataType {
	private final Map<String, Integer> fieldValues = new HashMap<String, Integer>();
	
	public RecordDataType(final String inputName, final List<String> fieldNames) {
		super(inputName);
		if (fieldNames != null) {
			for (String name : fieldNames) {
				fieldValues.put(name, 0);
			}
		}
	}
	
	public int getValueAtIndex(final String index){
		return fieldValues.get(index);
	}

	@Override
	public int getValue() {
		System.out.println("getValue() called on IntegerArrayType");
		return 0;
	}

	@Override
	public IDataType copy(final String newName) {
		// TODO Auto-generated method stub
		return null;
	}

}
