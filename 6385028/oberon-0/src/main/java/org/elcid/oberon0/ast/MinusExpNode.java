package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents the minus ('-') expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class MinusExpNode extends IntExpNode {

	private IntExpNode leftExp;
	private IntExpNode rightExp;

	public MinusExpNode(IntExpNode leftExp, IntExpNode rightExp) {
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
	public Object eval(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
