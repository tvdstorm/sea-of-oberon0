/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;

/**
 * @author arieveek
 *
 */
public abstract class AbstractDeclarationNode implements ASTNode {

	private final ASTNode expression;

	/**
	 * Constructor to create a
	 * 
	 * @param expression
	 *            Expression linked to the declaration
	 */
	public AbstractDeclarationNode(ASTNode expression) {
		// Expression should not be null
		assert expression != null;
		this.expression = expression;
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		return expression.toTreeString(ident);
	}
}
