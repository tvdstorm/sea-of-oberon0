package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.ast.visitor.ExpressionVisitor;

/**
 * Represents the plus ('+') expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class PlusExpNode extends ExpressionNode {

	private ExpressionNode leftExp;
	private ExpressionNode rightExp;

	public PlusExpNode(ExpressionNode leftExp, ExpressionNode rightExp) {
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
	public Value eval(ExpressionVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}
