package org.elcid.oberon0.ast.env;

import org.elcid.oberon0.ast.values.Value;

/**
 *
 * @author Pieter Brandwijk
 */
public abstract class Reference {

	public abstract Value get();

	public abstract void set(Value value, Environment env);

	public abstract Value applySelector(Object key);

}
