/**
 * 
 */
package com.arievanderveek.soo.ast.expr.binaryoperators;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * @author arieveek
 * 
 */
public class SmallerEqualThenOperatorNode extends AbstractBinaryOperatorNode {

	/**
	 * @param leftHandNode
	 * @param rightHandNode
	 */
	public SmallerEqualThenOperatorNode(ExpressionNode leftHandNode, ExpressionNode rightHandNode) {
		super(leftHandNode, rightHandNode);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(super.leftHandNode.toTreeString(ident));
		sb.append(ident + "Smaller Equal then" + ident);
		sb.append(super.rightHandNode.toTreeString(ident));
		return sb.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		if (super.leftHandNode.interpret(scope) <= super.rightHandNode.interpret(scope)) {
			return 1;
		} else {
			return 0;
		}
	}

}
