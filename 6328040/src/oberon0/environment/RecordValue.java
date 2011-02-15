package oberon0.environment;

import java.util.HashMap;
import java.util.Map;

import oberon0.ast.variables.types.IType;

public class RecordValue implements IValue {
	private final Map<String, Reference> _fields;

	public RecordValue(Map<String, Reference> values) {
		_fields = new HashMap<String, Reference>();
		for (String name : values.keySet()) {
			_fields.put(name, values.get(name).getCopy());
		}
	}
	
	public static RecordValue getDefaultValue(Context context, Map<String, IType>  fields) {
		Map<String, Reference> RefFields = new HashMap<String, Reference>();
		for (String name : fields.keySet()) {
			IValue currentDefaultValue = fields.get(name).getDefaultValue(context);
			RefFields.put(name, new Reference(currentDefaultValue));
		}
		return new RecordValue(RefFields);
	}

	public Reference getReference(String key) {
		return _fields.get(key);
	}

	public IValue getValue(String key) {
		return _fields.get(key).getValue();
	}

	@Override
	public String toString() {
		String buffer = "[ ";
		for (String currentKey : _fields.keySet()) {
			buffer += currentKey + "=" + _fields.get(currentKey).toString()
					+ " ";
		}
		return buffer + " ] ";
	}

	@Override
	public IValue getCopy() {
		return new RecordValue(_fields);
	}

	public Map<String, Reference> getFields() {
		return _fields;
	}
}
