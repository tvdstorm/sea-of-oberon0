package org.elcid.oberon0.ast.values;

import org.elcid.oberon0.exceptions.UnboundVariableException;

/**
 * Represents integer variables in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class IntVariable extends Value {

	private String name;

	public IntVariable(String name, Integer value, Environment env) {
		this.name = name;
		env.put(name, value);
	}

	public Integer getValue(Environment localEnv) {
		Integer value = localEnv.getValue(name);
		if (value == null)
			throw new UnboundVariableException("Variable " + name + " has no value");
		return value;
	}

}
