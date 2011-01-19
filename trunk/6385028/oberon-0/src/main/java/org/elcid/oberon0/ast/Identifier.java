package org.elcid.oberon0.ast;

/**
 * A representation of identifiers in the Oberon-0 language
 *
 * @author Pieter Brandwijk
 */
public class Identifier {

	/** The identifier's value can only be set once, when the object is constructed */
	private final String value;

	public Identifier(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
