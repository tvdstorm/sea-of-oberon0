package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.ast.visitors.ExpressionVisitor;

/**
 * Base class for Oberon-0 expressions. Not meant to be instantiated directly, so it's abstract
 *
 * @author Pieter Brandwijk
 */
public abstract class ExpressionNode extends Node {

	public abstract Value eval(ExpressionVisitor visitor, Environment localEnv);

}
