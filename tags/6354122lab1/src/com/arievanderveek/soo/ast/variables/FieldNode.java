/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Represents a field which consists of a field name and type
 * 
 * @author arieveek
 * 
 */
public class FieldNode implements ASTNode {

	private String name;
	private ASTNode type;

	/**
	 * Constructor for
	 * 
	 * @param name
	 * @param type
	 */
	public FieldNode(String name, ASTNode type) {
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
	public ASTNode getType() {
		return type;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret(com.arievanderveek.soo.
	 * symboltable.Scope)
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return null;
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