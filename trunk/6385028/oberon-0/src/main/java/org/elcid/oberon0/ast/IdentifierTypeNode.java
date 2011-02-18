package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.values.Value;
import org.elcid.oberon0.visitors.TypeVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class IdentifierTypeNode extends TypeNode{
	
	public static final String INTEGER_TYPE = "INTEGER";

	private String identifier;

	public IdentifierTypeNode(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	@Override
	public Value init(TypeVisitor visitor, Environment env) {
		return visitor.init(this, env);
	}

}
