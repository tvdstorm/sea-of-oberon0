/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.LinkedList;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.visitors.ASTVisitor;

/**
 * @author arieveek
 *
 */
public abstract class AbstractCallNode implements ASTNode {
	
	protected final ASTNode identifier;
	protected final List<ASTNode> parameters;
	
	/**
	 * Constructor with all fields
	 * 
	 * @param identifier The procedure identifier
	 * @param parameters The procedure parameters
	 */
	public AbstractCallNode(ASTNode identifier, List<ASTNode> parameters) {
		this.identifier = identifier;
		this.parameters = parameters;
	}

	/**
	 * Constructor with minimal fields.
	 * 
	 * @param identifier The procedure identifier
	*/
	public AbstractCallNode(ASTNode identifier) {
		this.identifier = identifier;
		// Create an empty list, so it does not return null and can be used in loops.
		this.parameters = new LinkedList();
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("Procedure" + ident);
		sb.append(identifier.toTreeString(ident));
		sb.append(ident + "(" + ident); 
		for (ASTNode node : parameters ){
			sb.append(node.toTreeString(ident));
			sb.append(",");
		}
		sb.append(ident + ")");
		return sb.toString();
	}


}
