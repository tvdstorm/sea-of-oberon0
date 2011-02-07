package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents the plus ('+') expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class PlusExpNode extends IntExpNode {

	private IntExpNode leftExp;
	private IntExpNode rightExp;

	public PlusExpNode(IntExpNode leftExp, IntExpNode rightExp) {
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
	public Integer accept(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
