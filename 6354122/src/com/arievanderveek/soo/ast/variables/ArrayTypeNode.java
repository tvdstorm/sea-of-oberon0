/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.visitors.ASTVisitor;

/**
 * @author arieveek
 *
 */
public class ArrayTypeNode implements ASTNode {
	
	private ASTNode sizeExpression;
	private ASTNode[] arrayContent;
	private ASTNode type;
	
	/**
	 * Constructor with all required fields
	 * 
	 * @param sizeExpression the expression that is the size of the array
	 * @param type	the type of the array
	 */
	public ArrayTypeNode(ASTNode sizeExpression, ASTNode type) {
		// Expression will be evaluated later to create a size.
		this.sizeExpression = sizeExpression;
		this.type = type;
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public int interpret() throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
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

}
