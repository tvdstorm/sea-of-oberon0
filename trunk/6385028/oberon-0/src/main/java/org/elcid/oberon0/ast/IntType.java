package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.ast.visitor.TypeVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class IntType extends TypeNode {

	public IntType() {

	}

	@Override
	public Value init(TypeVisitor visitor, Environment env) {
		return visitor.init(this, env);
	}

}
