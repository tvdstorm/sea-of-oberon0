package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents the equals expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class EqualsExpNode extends BooleanExpNode {

	private ExpressionNode leftExp;
	private ExpressionNode rightExp;

	public EqualsExpNode(ExpressionNode leftExp, ExpressionNode rightExp) {
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	public ExpressionNode getLeftExp() {
		return leftExp;
	}

	public ExpressionNode getRightExp() {
		return rightExp;
	}

	@Override
	public Boolean accept(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
