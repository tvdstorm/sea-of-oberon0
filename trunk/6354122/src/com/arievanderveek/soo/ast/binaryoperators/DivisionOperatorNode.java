/**
 * 
 */
package com.arievanderveek.soo.ast.binaryoperators;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * @author arieveek
 *
 */
public class DivisionOperatorNode extends AbstractBinaryOperatorNode {

	/**
	 * @param leftHandNode
	 * @param rightHandNode
	 */
	public DivisionOperatorNode(ASTNode leftHandNode, ASTNode rightHandNode) {
		super(leftHandNode, rightHandNode);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
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

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		return super.leftHandNode.interpret(scope) / super.rightHandNode.interpret(scope);
	}

}
