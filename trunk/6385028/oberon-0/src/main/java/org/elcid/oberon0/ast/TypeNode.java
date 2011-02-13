package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.ast.visitor.TypeVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class TypeNode {

	public abstract Value init(TypeVisitor visitor, Environment env);

}
