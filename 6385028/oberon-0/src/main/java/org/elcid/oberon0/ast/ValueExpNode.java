package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents values (integers and integer variables) in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class ValueExpNode extends IntExpNode {

	private Value value;

	public ValueExpNode(Value value) {
		this.value = value;
	}

	public Integer getValue(Environment localEnv) {
		return value.getValue(localEnv);
	}

	@Override
	public Object accept(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
