/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;

/**
 * @author arieveek
 *
 */
public class WriteLnCallNode extends AbstractCallNode {

	/**
	 * @param identifier
	 */
	public WriteLnCallNode(ASTNode identifier) {
		super(identifier);
	}
	
	/**
	 * @param identifier
	 */
	public WriteLnCallNode(ASTNode identifier, List<ASTNode> parameters) {
		super(identifier,parameters);
	}
	
	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public int interpret() throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return 0;
	}

}