package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.values.Value;
import org.elcid.oberon0.ast.visitors.ExpressionVisitor;

/**
 * Represents the modulo ('MOD') expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class ModuloExpNode extends ExpressionNode {

	private ExpressionNode leftExp;
	private ExpressionNode rightExp;

	public ModuloExpNode(ExpressionNode leftExp, ExpressionNode rightExp) {
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
