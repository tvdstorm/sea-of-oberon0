package org.elcid.oberon0.values;

/**
 * Abstract representation of values in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public abstract class Value {

	public abstract Value applySelector(Object key);

	public abstract void set(Value value);

	@Override
	public abstract Value clone();
	
}
