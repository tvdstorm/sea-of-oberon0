package org.elcid.oberon0.ast.values;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.exceptions.UnboundVariableException;

/**
 * Represents integer variables in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class Variable extends Value {

	private String name;

	public Variable(String name) {
		this.name = name;
	}

	@Override
	public Integer getValue(Environment localEnv) {
		Integer value = localEnv.getValue(name);
		if (value == null)
			throw new UnboundVariableException("Variable " + name + " has no value");
		return value;
	}

}
