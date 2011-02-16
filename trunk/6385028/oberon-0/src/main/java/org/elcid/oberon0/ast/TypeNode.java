package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.values.Value;
import org.elcid.oberon0.visitors.TypeVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class TypeNode {

	public abstract Value init(TypeVisitor visitor, Environment env);

}
