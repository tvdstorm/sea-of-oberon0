package org.elcid.oberon0.env;

import org.elcid.oberon0.values.Value;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class FormalParameter {

	public abstract void declare(Environment env, Value value);

}
