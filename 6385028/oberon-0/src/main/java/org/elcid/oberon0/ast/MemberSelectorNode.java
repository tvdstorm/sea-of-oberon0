package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;

/**
 *
 * @author Pieter Brandwijk
 */
public class MemberSelectorNode extends SelectorNode {
	
	private String identifier;

	public MemberSelectorNode(String identifier) {
		this.identifier = identifier;
	}

	@Override
	public Object select(Environment env) {
		return identifier;
	}

}
