/**
 * 
 */
package com.arievanderveek.soo.ast.unaryoperators;

import com.arievanderveek.soo.ast.ASTNode;

/**
 * Represents a unary node.
 * 
 * @author arieveek
 * 
 */
public abstract class UnaryOperatorNode implements ASTNode {

	private final ASTNode node;

	public UnaryOperatorNode(ASTNode node) {
		assert(node!=null);
		this.node = node;
	}

	/**
	 * Getter for node
	 * 
	 * @return the node
	 */
	public ASTNode getNode() {
		return node;
	}
}