package org.elcid.oberon0.ast.values;

import org.elcid.oberon0.exceptions.TerminalValueException;

/**
 * Represents integers in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class Int extends Value {
	
	private Integer value;

	public Int(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		assert (value != null) : "Int value is null";
		return value;
	}

	@Override
	public Value applySelector(Object key) {
		throw new TerminalValueException("Can't select on an integer value");
	}

	@Override
	public void set(Value value) {
		this.value = ((Int) value).getValue();
	}

}
