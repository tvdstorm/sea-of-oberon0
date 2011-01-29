/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.visitors.ASTVisitor;

/**
 * Represents a Type declarations
 * 
 * @author arieveek
 * 
 */
public class TypeDeclarationNode extends AbstractDeclarationNode {

	/**
	 * @param expression
	 */
	public TypeDeclarationNode(ASTNode expression) {
		super(expression);
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
