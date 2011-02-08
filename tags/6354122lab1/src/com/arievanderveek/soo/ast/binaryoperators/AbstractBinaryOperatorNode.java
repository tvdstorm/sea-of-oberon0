/**
 * 
 */
package com.arievanderveek.soo.ast.binaryoperators;

import com.arievanderveek.soo.ast.ASTNode;

/**
 * An class to represent a binary node, like an addition or relational operator.
 * 
 * @author arieveek
 * 
 */
public abstract class AbstractBinaryOperatorNode implements ASTNode {

	protected final ASTNode leftHandNode, rightHandNode;

	public AbstractBinaryOperatorNode(ASTNode leftHandNode,
			ASTNode rightHandNode) {
		assert leftHandNode != null;
		assert rightHandNode != null;
		this.leftHandNode = leftHandNode;
		this.rightHandNode = rightHandNode;
	}

}
