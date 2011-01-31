package jdm.oberon0.types;

import java.util.HashMap;

public class RecordType implements Type {
	private HashMap<String, Type> _fields;
	
	public RecordType(HashMap<String, Type> fields) {
		_fields = fields;
	}

	public HashMap<String, Type> getFields() {
		return _fields;
	}

	@Override
	public boolean equals(Type other) {
		if (!(other instanceof RecordType)) {
			return false;
		}
		RecordType recordOther = (RecordType)other;
		return _fields.equals(recordOther._fields);
	}
}

