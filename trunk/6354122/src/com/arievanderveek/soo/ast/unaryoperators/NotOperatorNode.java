/**
 * 
 */
package com.arievanderveek.soo.ast.unaryoperators;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;

/**
 * @author arieveek
 *
 */
public class NotOperatorNode extends UnaryOperatorNode {

	/**
	 * @param node
	 */
	public NotOperatorNode(ASTNode node) {
		super(node);
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public int interpret() throws SeaOfOberonException {
		if (getNode().interpret()==1){
			return 0;
		} else { 
			if (getNode().interpret()==0){
				return 1;
			} else {
				throw new SeaOfOberonException("Not Operator node did not return a boolean value");
			}
		}
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("NOT" + ident);
		sb.append(getNode().toTreeString(ident));
		return sb.toString();
	}

}
