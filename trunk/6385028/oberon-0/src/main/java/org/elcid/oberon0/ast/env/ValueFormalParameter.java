package org.elcid.oberon0.ast.env;

import org.elcid.oberon0.ast.TypeNode;
import org.elcid.oberon0.ast.values.Value;

/**
 *
 * @author Pieter Brandwijk
 */
public class ValueFormalParameter extends FormalParameter {

	private String identifier;
	private TypeNode type;

	public ValueFormalParameter(String identifier, TypeNode type) {
		this.identifier = identifier;
		this.type = type;
	}

	@Override
	public void declare(Environment env, Value value) {
		env.declareByValue(identifier, value);
	}

}
