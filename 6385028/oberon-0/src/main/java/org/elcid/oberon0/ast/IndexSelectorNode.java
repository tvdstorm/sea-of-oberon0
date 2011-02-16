package org.elcid.oberon0.ast;

import org.elcid.oberon0.ast.env.Environment;
import org.elcid.oberon0.ast.visitors.ExpressionVisitor;

/**
 *
 * @author Pieter Brandwijk
 */
public class IndexSelectorNode extends SelectorNode{

	private ExpressionNode expression;

	public IndexSelectorNode(ExpressionNode expression) {
		this.expression = expression;
	}

	@Override
	public Object select(Environment env) {
		return expression.eval(new ExpressionVisitor(), env);
	}

}
