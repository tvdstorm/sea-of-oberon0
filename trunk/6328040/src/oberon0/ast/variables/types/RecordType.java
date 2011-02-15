package oberon0.ast.variables.types;

import java.util.HashMap;
import java.util.Map;

import oberon0.environment.Context;
import oberon0.environment.IValue;
import oberon0.environment.RecordValue;

public class RecordType implements IType {
	private final Map<String, IType> _fields;

	public RecordType(HashMap<String, IType> rec) {
		if (rec != null) {
			_fields = rec;
		} else {
			_fields = new HashMap<String, IType>();
		}
	}

	@Override
	public TypeNames getTypeName(Context context) {
		return TypeNames.RECORD;
	}

	@Override
	public IValue getDefaultValue(Context context) {
		return RecordValue.getDefaultValue(context, _fields);
	}
}
