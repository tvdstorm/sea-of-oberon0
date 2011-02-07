package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents an and expression ('OR') in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class OrExpNode extends BooleanExpNode {

	private BooleanExpNode leftExp;
	private BooleanExpNode rightExp;

	public OrExpNode(BooleanExpNode leftExp, BooleanExpNode rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	public BooleanExpNode getLeftExp() {
		return leftExp;
	}

	public BooleanExpNode getRightExp() {
		return rightExp;
	}

	@Override
	public Boolean accept(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
