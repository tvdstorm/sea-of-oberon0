package org.elcid.oberon0.ast;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an identifier selector in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class IdentSelectorNode {

	private String identifier;
	private List<Selector> selectors;

	public IdentSelectorNode(String identifier) {
		this.identifier = identifier;
		this.selectors = new ArrayList<Selector>();
	}

	public String getIdentifier() {
		return identifier;
	}

	public List<Selector> getSelectors() {
		return selectors;
	}

	public void addSelector(Selector selector) {
		selectors.add(selector);;
	}

	

}
