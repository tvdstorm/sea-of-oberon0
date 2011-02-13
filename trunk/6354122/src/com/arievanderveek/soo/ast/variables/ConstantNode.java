/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.expr.ExpressionNode;

/**
 * Represents a declaration of a variable, constant or type.
 * 
 * @author arieveek
 * 
 */
public class ConstantNode implements ASTNode {

	private final String name;
	private final ExpressionNode expression;

	/**
	 * Constructor to create a
	 * 
	 * @param expression
	 *            Expression linked to the declaration
	 */
	public ConstantNode(String name, ExpressionNode expression) {
		// Expression should not be null
		assert expression != null;
		this.name = name;
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

	/**
	 * Getter for expression
	 * 
	 * @return The expression
	 */
	public ExpressionNode getExpression() {
		return this.expression;
	}

	public String getName() {
		return name;
	}

}
