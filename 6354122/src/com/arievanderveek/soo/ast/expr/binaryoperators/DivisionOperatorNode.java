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
public class DivisionOperatorNode extends AbstractBinaryOperatorNode {

	/**
	 * @param leftHandNode
	 * @param rightHandNode
	 */
	public DivisionOperatorNode(ExpressionNode leftHandNode, ExpressionNode rightHandNode) {
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
		sb.append(ident + "DIV" + ident);
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
		return super.leftHandNode.interpret(scope)
				/ super.rightHandNode.interpret(scope);
	}

}
