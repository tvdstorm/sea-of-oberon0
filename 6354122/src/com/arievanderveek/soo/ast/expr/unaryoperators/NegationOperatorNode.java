/**
 * 
 */
package com.arievanderveek.soo.ast.expr.unaryoperators;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * @author arieveek
 * 
 */
public class NegationOperatorNode extends UnaryOperatorNode {

	/**
	 * @param node
	 */
	public NegationOperatorNode(ExpressionNode node) {
		super(node);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("NEGATION" + ident);
		sb.append(getNode().toTreeString(ident));
		return sb.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		return -getNode().interpret(scope);
	}

}
