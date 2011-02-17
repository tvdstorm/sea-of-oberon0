/**
 * 
 */
package com.arievanderveek.soo.ast.expr.unaryoperators;

import com.arievanderveek.soo.ast.expr.ExpressionNode;

/**
 * Represents a unary node.
 * 
 * @author arieveek
 * 
 */
public abstract class UnaryOperatorNode extends ExpressionNode {

	private final ExpressionNode node;

	public UnaryOperatorNode(ExpressionNode node) {
		assert (node != null);
		this.node = node;
	}

	/**
	 * Getter for node
	 * 
	 * @return the node
	 */
	public ExpressionNode getNode() {
		return node;
	}
}