package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.StatementVisitor;

/**
 * Base class for statements in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public abstract class StatementNode extends Node {

	public abstract void run(StatementVisitor visitor, Environment localEnv);

}
