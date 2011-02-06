/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * Represents a Variable
 * 
 * @author arieveek
 * 
 */
public class VariableDeclarationNode extends AbstractDeclarationNode {

	/**
	 * @param expression
	 */
	public VariableDeclarationNode(ASTNode expression) {
		super(expression);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return 0;
	}

}
