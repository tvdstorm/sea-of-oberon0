package org.elcid.oberon0.ast.values;

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

}
