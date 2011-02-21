/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;

/**
 * Represents a field which consists of a field name and type
 * 
 * @author arieveek
 * 
 */
public class FieldNode implements ASTNode {

	private String name;
	private TypeNode type;

	/**
	 * Constructor for a field node
	 * 
	 * @param name
	 * @param type
	 */
	public FieldNode(String name, TypeNode type) {
		assert name != null;
		assert type != null;
		this.name = name;
		this.type = type;
	}

	/**
	 * Getter for name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for type
	 * 
	 * @return the type
	 */
	public TypeNode getType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(ident + name);
		sb.append(" = ");
		sb.append(type.toTreeString(ident));
		return sb.toString();
	}
}