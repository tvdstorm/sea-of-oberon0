package jdm.oberon0.types;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

public class RecordType implements Type {
	private Map<String, ReferenceType> _fields;
	
	public RecordType(Map<String, ReferenceType> fields) {
		_fields = fields;
	}

	@Override
	public boolean equals(Type other) {
		if (!(other instanceof RecordType)) {
			return false;
		}
		RecordType recordOther = (RecordType)other;
		return _fields.equals(recordOther._fields);
	}
	
	public ReferenceType getFieldType(String field) {
		return _fields.get(field);
	}
	
	public Set<String> getFields() {
		return Collections.unmodifiableSet(_fields.keySet());
	}
}

