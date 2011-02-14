package org.elcid.oberon0.ast.env;

import org.elcid.oberon0.ast.TypeNode;

/**
 *
 * @author Pieter Brandwijk
 */
public class FormalParameter {

	private String identifier;
	private TypeNode type;

	public FormalParameter(String identifier, TypeNode type) {
		this.identifier = identifier;
		this.type = type;
	}

	public String getIdentifier() {
		return identifier;
	}

	public TypeNode getType() {
		return type;
	}

}
