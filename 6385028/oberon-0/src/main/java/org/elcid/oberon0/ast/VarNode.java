package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;

/**
 * Represents a variable in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class VarNode {

	/*
	 * Put the given variable name and its value as a mapping in the environment.
	 */
	public VarNode(String name, Integer value, Environment env) {
		env.put(name, value);
	}

}
