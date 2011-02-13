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
public class OrOperatorNode extends AbstractBinaryOperatorNode {

	/**
	 * @param leftHandNode
	 * @param rightHandNode
	 */
	public OrOperatorNode(ExpressionNode leftHandNode, ExpressionNode rightHandNode) {
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
		sb.append(ident + "OR" + ident);
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
		if ((super.leftHandNode.interpret(scope) == 1)
				|| (super.rightHandNode.interpret(scope) == 1)) {
			return 1;
		} else {
			return 0;
		}
	}

}
