package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents the greater-than-or-equals expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class GreaterOrEqualsExpNode extends BooleanExpNode {

	private IntExpNode leftExp;
	private IntExpNode rightExp;

	public GreaterOrEqualsExpNode(IntExpNode leftExp, IntExpNode rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	public IntExpNode getLeftExp() {
		return leftExp;
	}

	public IntExpNode getRightExp() {
		return rightExp;
	}

	@Override
	public Boolean eval(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
