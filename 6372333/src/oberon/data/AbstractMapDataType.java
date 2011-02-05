package oberon.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import oberon.IDataType;

public abstract class AbstractMapDataType<T> extends AbstractDataType {
	private final Map<T, Integer> fieldValues = new HashMap<T, Integer>();
	
	public AbstractMapDataType(final String inputName, final List<T> fieldNames) {
		super(inputName);
		if (fieldNames != null) {
			for (T name : fieldNames) {
				fieldValues.put(name, 0);
			}
		}
	}
	
	public int getValueAtIndex(final T index){
		return fieldValues.get(index);
	}

	public void setValueAtIndex(final T index, final int value) {
		fieldValues.put(index, value);
	}

	
	@Override
	public int getValue() {
		System.out.println("getValue() called on AbstractMapDataType");
		return 0;
	}

	@Override
	public abstract IDataType copy(String newName);
}
