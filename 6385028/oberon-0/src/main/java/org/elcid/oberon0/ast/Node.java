package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Base class for all nodes in the AST.
 *
 * @author Pieter Brandwijk
 */
public abstract class Node {

	public abstract Object accept(BaseVisitor visitor, Environment localEnv);
	
}
