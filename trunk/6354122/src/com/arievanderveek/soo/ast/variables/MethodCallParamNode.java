/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * @author arieveek
 *
 */
public class MethodCallParamNode implements ASTNode{
	
	// TODO: SHITTY TMP CLASS FOR BUGFIX, FIXIT!!!
	
	private String Name;
	private ASTNode type;
	/**
	 * @param name
	 * @param type
	 */
	public MethodCallParamNode(String name, ASTNode type) {
		super();
		Name = name;
		this.type = type;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the type
	 */
	public ASTNode getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(ASTNode type) {
		this.type = type;
	}
	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret(com.arievanderveek.soo.symboltable.Scope)
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
