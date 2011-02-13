/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.variables.FieldNode;

/**
 * Represents a parameter node for call by value parameters
 * 
 * @author arieveek
 * 
 */
public class CallByValParameterNode extends AbstractParameterNode {

	/**
	 * @param formalParameter
	 */
	public CallByValParameterNode(List<FieldNode> formalParameter) {
		super(formalParameter);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		return super.toTreeString(ident);

	}

}
