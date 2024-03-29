package org.elcid.oberon0.values;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Pieter Brandwijk
 */
public class Record extends Value {

	private Map<String, Value> fields;

	public Record() {
		fields = new HashMap<String, Value>();
	}

	public void put(String identifier, Value field) {
		fields.put(identifier, field);
	}

	public Value getField(String identifier) {
		return fields.get(identifier);
	}

	public Set<String> getKeys() {
		return fields.keySet();
	}

	@Override
	public Value applySelector(Object key) {
		String identifier = (String) key;
		return fields.get(identifier);
	}

	@Override
	public void set(Value value) {
		this.fields = ((Record) value).fields;
	}

	@Override
	public Value clone() {
		Record clone = new Record();
		
		Map<String, Value> copiedElements = new HashMap<String, Value>();
		for (Map.Entry<String, Value> val : fields.entrySet()) {
			copiedElements.put(val.getKey(), val.getValue());
		}
		clone.fields = copiedElements;

		return clone;
	}
	
}
