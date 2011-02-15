package org.elcid.oberon0.ast.env;

import org.elcid.oberon0.ast.values.Value;

/**
 * Used for call by value.
 *
 * @author Pieter Brandwijk
 */
public class ValueReference extends Reference{

	private Value value;

	public ValueReference(Value value) {
		this.value = value;
	}

	@Override
	public Value get() {
		return value;
	}

	@Override
	public void set(Value value, Environment env) {
		this.value = value;
	}

	@Override
	public Value applySelector(Object key) {
		return value.applySelector(key);
	}

}
