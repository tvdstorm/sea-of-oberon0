package jdm.oberon0.values;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import jdm.oberon0.interpreter.ValueConstructor;
import jdm.oberon0.types.RecordType;
import jdm.oberon0.types.Type;

public class RecordValue extends Value {

	private RecordType _type;
	private Map<String, ReferenceValue> _values;
	
	public RecordValue(RecordType type) {
		Map<String, ReferenceValue> values = new HashMap<String, ReferenceValue>();
		
		for (String name : type.getFields()) {
			Type fieldType = type.getFieldType(name).getType();
			Value fieldValue = ValueConstructor.fromType(fieldType);
			values.put(name, ReferenceValue.getRef(fieldValue));
		}
		
		_type = type;
		_values = values;
	}
	
	@Override
	public String toNativeString() {
		return "";
	}


	@Override
	public boolean valueEquals(Value other) {
		if (!getType().equals(other.getType())) {
			return false;
		}
		RecordValue recordOther = other.toRecord();
		return _values.equals(recordOther._values);
	}

	public ReferenceValue getFieldValue(String name) {
		ReferenceValue v = _values.get(name);
		return v;
	}

	@Override
	public Type getType() {
		return _type;
	}
	
	@Override
	public RecordValue toRecord() {
		return this;
	}

	@Override
	public Value clone() {
		RecordValue value = new RecordValue(_type);
		value._values = new HashMap<String, ReferenceValue>(_values);
		return value;
	}

	public Set<String> getFields() {
		return Collections.unmodifiableSet(_values.keySet());
	}
}
