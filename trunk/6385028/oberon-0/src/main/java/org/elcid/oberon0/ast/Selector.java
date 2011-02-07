package org.elcid.oberon0.ast;

/**
 * Represents a selector in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class Selector {

	private String selector;

	public Selector(String selector) {
		this.selector = selector;
	}

	public String getSelector() {
		return selector;
	}

}
