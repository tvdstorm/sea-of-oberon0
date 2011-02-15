package org.elcid.oberon0.ast.values;

import java.util.HashMap;
import java.util.Map;

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

	@Override
	public Value applySelector(Object key) {
		String identifier = (String) key;
		return fields.get(identifier);
	}

	@Override
	public void set(Value value) {
		this.fields = ((Record) value).fields;
	}

}
