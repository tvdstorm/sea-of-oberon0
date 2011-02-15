package org.elcid.oberon0.ast.env;

import org.elcid.oberon0.ast.values.Value;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class FormalParameter {

	public abstract void declare(Environment env, Value value);

}
