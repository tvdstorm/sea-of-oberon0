package org.elcid.oberon0.ast.values;

import org.elcid.oberon0.ast.env.Environment;

/**
 * Abstract representation of values in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public abstract class Value {

	public abstract Integer getValue(Environment localEnv);

}
