/**
 * 
 */
package com.arievanderveek.soo.ast.variables;

import java.util.Map;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.symboltable.Scope;
import com.arievanderveek.soo.util.Constants;

/**
 * @author arieveek
 *
 */
public class CallByRefParameterNode extends AbstractParameterNode {

	/**
	 * @param formalParameter
	 */
	public CallByRefParameterNode(Map<String,ASTNode> formalParameter) {
		super(formalParameter);
	}

	/* (non-Javadoc)
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
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
