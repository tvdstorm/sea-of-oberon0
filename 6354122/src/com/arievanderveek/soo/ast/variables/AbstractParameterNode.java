/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;

/**
 * @author arieveek
 *
 */
public abstract class AbstractParameterNode implements ASTNode {
	
	Map<String,ASTNode> formalParameter;

	/**
	 * @param formalParameter 
	 */
	public AbstractParameterNode(Map<String,ASTNode> formalParameter) {
		this.formalParameter = formalParameter;
	}
	
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		for (String key : formalParameter.keySet()){
			sb.append(key + ident);
			sb.append(ident + "=" + ident);
			sb.append(formalParameter.get(key).toTreeString(ident));
			sb.append(LINE_SEPARATOR);
		}
		return sb.toString();
	}	
}
