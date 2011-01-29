/**
 * 
 */
package com.arievanderveek.soo.ast.binaryoperators;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;

/**
 * @author arieveek
 *
 */
public class AdditionOperatorNode extends AbstractBinaryOperatorNode {

	/**
	 * @param leftHandNode
	 * @param rightHandNode
	 */
	public AdditionOperatorNode(ASTNode leftHandNode, ASTNode rightHandNode) {
		super(leftHandNode, rightHandNode);
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(super.leftHandNode.toTreeString(ident));
		sb.append(ident + "+" + ident); 
		sb.append(super.rightHandNode.toTreeString(ident));
		return sb.toString();
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public int interpret() throws SeaOfOberonException {
		return super.leftHandNode.interpret() + super.rightHandNode.interpret();
	}
}
