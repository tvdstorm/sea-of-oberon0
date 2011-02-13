/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Represents an array type definition
 * 
 * @author arieveek
 * 
 */
public class ArrayTypeNode extends TypeNode  {

	private final ExpressionNode sizeExpression;
	private final TypeNode type;

	/**
	 * Constructor with all required fields
	 * 
	 * @param sizeExpression
	 *            the expression that is the size of the array
	 * @param type
	 *            the type of the array
	 */
	public ArrayTypeNode(ExpressionNode sizeExpression, TypeNode type) {
		// Expression will be evaluated later to create a size.
		this.sizeExpression = sizeExpression;
		this.type = type;
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("ARRAY" + ident);
		sb.append(sizeExpression.toTreeString(ident));
		sb.append(ident + "OF" + ident);
		sb.append(type.toTreeString(ident));
		return sb.toString();
	}

	/**
	 * @return the sizeExpression
	 */
	public ExpressionNode getSizeExpression() {
		return sizeExpression;
	}

	/**
	 * @return the type
	 */
	public TypeNode getType() {
		return type;
	}


	@Override
	public void registerType(String identifier, Scope scope) throws SeaOfOberonException {
		Integer resolvedSizeExpression = sizeExpression.interpret(scope);
		scope.addArraySymbol(identifier,resolvedSizeExpression);
	}

}
