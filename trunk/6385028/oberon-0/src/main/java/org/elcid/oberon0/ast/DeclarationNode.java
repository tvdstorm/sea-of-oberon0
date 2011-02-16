package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.visitors.DeclarationVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class DeclarationNode {

	public abstract void run(DeclarationVisitor visitor, Environment env);

}
