package org.elcid.oberon0.ast;

import java.util.List;

/**
 *
 * @author Pieter Brandwijk
 */
public class FpSectionNode {

	private List<String> identifiers;
	private TypeNode type;

	public FpSectionNode(List<String> identifiers, TypeNode type) {
		this.identifiers = identifiers;
		this.type = type;
	}

	public List<String> getIdentifiers() {
		return identifiers;
	}

	public TypeNode getType() {
		return type;
	}
	
}
