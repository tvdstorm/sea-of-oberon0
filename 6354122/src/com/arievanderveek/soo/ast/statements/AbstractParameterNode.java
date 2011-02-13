/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.util.Constants;

/**
 * Abstract class representing an parameter node for procedure calls
 * 
 * @author arieveek
 * 
 */
public abstract class AbstractParameterNode implements ASTNode {

	final List<FieldNode> formalParameter;

	/**
	 * @param formalParameter
	 */
	public AbstractParameterNode(List<FieldNode> formalParameter) {
		this.formalParameter = formalParameter;
	}

	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		for (ASTNode key : formalParameter) {
			FieldNode node = (FieldNode) key;
			sb.append(node.getName() + ident);
			sb.append(ident + "=" + ident);
			sb.append(node.getType().toTreeString(ident));
			sb.append(Constants.LINE_SEPARATOR);
		}
		return sb.toString();
	}

	/**
	 * @return the formalParameter
	 */
	public List<FieldNode> getFormalParameter() {
		return formalParameter;
	}
}
