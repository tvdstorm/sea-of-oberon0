package org.elcid.oberon0.ast.values;

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

	public Integer getValue(Environment env) {
		return env.getValue(name);
	}

}
