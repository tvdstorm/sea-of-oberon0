package org.elcid.oberon0.ast;

import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.values.Int;
import org.elcid.oberon0.values.Value;
import org.elcid.oberon0.visitors.ExpressionVisitor;

/**
 * Represents expressions of integer values in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class IntExpNode extends ExpressionNode {

	private int value;

	public IntExpNode(int value) {
		this.value = value;
	}

	public Int getValue() {
		return new Int(value);
	}

	@Override
	public Value eval(ExpressionVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
