/**
 * 
 */
package com.arievanderveek.soo.ast.expr.binaryoperators;

import com.arievanderveek.soo.ast.expr.ExpressionNode;

/**
 * An class to represent a binary node, like an addition or relational operator.
 * 
 * @author arieveek
 * 
 */
public abstract class AbstractBinaryOperatorNode extends ExpressionNode {

	protected final ExpressionNode leftHandNode, rightHandNode;

	public AbstractBinaryOperatorNode(ExpressionNode leftHandNode, ExpressionNode rightHandNode) {
		assert leftHandNode != null;
		assert rightHandNode != null;
		this.leftHandNode = leftHandNode;
		this.rightHandNode = rightHandNode;
	}

}
