package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.BaseVisitor;

/**
 * Represents the not ("~") expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class NegativeExpNode extends ExpressionNode {

	private ExpressionNode expression;

	public NegativeExpNode(ExpressionNode expression) {
		this.expression = expression;
	}

	public ExpressionNode getExpression() {
		return expression;
	}

	@Override
	public Object eval(BaseVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}