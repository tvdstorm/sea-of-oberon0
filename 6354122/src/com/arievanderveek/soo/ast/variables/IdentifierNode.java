/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.visitors.ASTVisitor;

/**
 * AST Node representing an Identifier
 * 
 * @author arieveek
 *
 */
public class IdentifierNode implements ASTNode {
	
	private final String name;
	private final ASTNode selectors;
	
	public IdentifierNode(String name)
	{	
		assert name!=null;
		this.name = name;
		this.selectors = null;
	}
	
	public IdentifierNode(String name, ASTNode selectors)
	{
//		assert name!=null;
		assert selectors!=null;
		this.name = name;
		this.selectors = selectors;
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
		sb.append(name + ident);
		if (selectors!=null){
			sb.append(selectors.toTreeString(ident));
		}
		return sb.toString();	
	}
}
