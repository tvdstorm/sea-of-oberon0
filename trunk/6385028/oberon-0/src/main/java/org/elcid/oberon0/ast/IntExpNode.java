package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Int;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents expressions of integer values in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class IntExpNode extends ExpressionNode {

	private Int value;

	public IntExpNode(Int value) {
		this.value = value;
	}

	public Int getValue() {
		return value;
	}

	@Override
	public Object eval(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
