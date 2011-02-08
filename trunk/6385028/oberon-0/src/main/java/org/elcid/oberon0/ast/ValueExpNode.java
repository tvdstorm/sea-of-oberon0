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

	public Object getValue(Environment localEnv) {
		return value.applySelector(localEnv);
	}

	@Override
	public Object eval(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
