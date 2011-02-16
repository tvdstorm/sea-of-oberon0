package org.elcid.oberon0.values;

import org.elcid.oberon0.exceptions.TerminalValueException;

/**
 * Represents integers in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class Int extends Value {
	
	private int value;

	public Int(int value) {
		this.value = value;
	}

	public int getValue() {
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

	@Override
	public Int clone() {
		return new Int(value);
	}

	@Override
	public String toString() {
		return this.value + "";
	}


}
