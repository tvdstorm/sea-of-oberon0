/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.variables.FieldNode;
import com.arievanderveek.soo.util.Constants;

/**
 * Represents a parameter node for call by reference (VAR) parameters
 * 
 * @author arieveek
 * 
 */
public class CallByRefParameterNode extends AbstractParameterNode {

	/**
	 * @param formalParameter
	 */
	public CallByRefParameterNode(List<FieldNode> formalParameter) {
		super(formalParameter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("VAR");
		sb.append(Constants.LINE_SEPARATOR);
		sb.append(super.toTreeString(ident));
		return sb.toString();
	}

}
