package org.elcid.oberon0.ast.env;

import org.elcid.oberon0.ast.values.Value;

/**
 * Used for call by reference.
 *
 * @author Pieter Brandwijk
 */
public class RefReference extends Reference {

	private Value value;

	public RefReference(Value value) {
		this.value = value;
	}
	
	public Value get() {
		return value;
	}

	@Override
	public void set(Value value, Environment env) {
		this.value.set(value);
	}

	@Override
	public Value applySelector(Object key) {
		return value.applySelector(key);
	}



}
