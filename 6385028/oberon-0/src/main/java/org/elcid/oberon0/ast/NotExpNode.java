package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitor.ExpressionVisitor;

/**
 * Represents the not ("~") expression in the Oberon-0 language.
 *
 * @author Pieter Brandwijk
 */
public class NotExpNode extends ExpressionNode {

	private ExpressionNode expression;

	public NotExpNode(ExpressionNode expression) {
		this.expression = expression;
	}

	public ExpressionNode getExpression() {
		return expression;
	}

	@Override
	public Object eval(ExpressionVisitor visitor, Environment localEnv) {
		return visitor.eval(this, localEnv);
	}

}