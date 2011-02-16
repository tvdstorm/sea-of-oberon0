package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.values.Value;
import org.elcid.oberon0.visitors.TypeVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class IntTypeNode extends TypeNode {

	public IntTypeNode() {

	}

	@Override
	public Value init(TypeVisitor visitor, Environment env) {
		return visitor.init(this, env);
	}

}
