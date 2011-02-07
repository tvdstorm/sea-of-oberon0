/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Represents an INTEGER type definition
 * 
 * AST Node representing an Integer
 * 
 * @author arieveek
 * 
 */
public class IntegerTypeNode implements ASTNode {

	final Integer value;

	public IntegerTypeNode(Integer value) {
		assert value != null;
		this.value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		return value.intValue();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(ident + value.intValue() + ident);
		return sb.toString();
	}

}
