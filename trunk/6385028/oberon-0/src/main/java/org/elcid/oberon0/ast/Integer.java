package org.elcid.oberon0.ast;

/**
 * A representation of integers in the Oberon-0 language
 *
 * @author Pieter Brandwijk
 */
public class Integer {

	/** The integer's value can only be set once, when the object is constructed */
	private final int value;

	public Integer(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
