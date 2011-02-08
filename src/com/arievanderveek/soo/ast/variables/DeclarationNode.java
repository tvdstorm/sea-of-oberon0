/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Represents a declaration of a variable, constant or type.
 * 
 * @author arieveek
 * 
 */
public class DeclarationNode implements ASTNode {

	private final ASTNode expression;

	/**
	 * Constructor to create a
	 * 
	 * @param expression
	 *            Expression linked to the declaration
	 */
	public DeclarationNode(ASTNode expression) {
		// Expression should not be null
		assert expression != null;
		this.expression = expression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		return expression.toTreeString(ident);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		return null;
	}

	/**
	 * Getter for expression
	 * 
	 * @return The expression
	 */
	public ASTNode getExpression() {
		return this.expression;
	}

}
