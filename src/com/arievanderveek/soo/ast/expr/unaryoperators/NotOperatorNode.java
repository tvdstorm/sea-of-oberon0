/**
 * 
 */
package com.arievanderveek.soo.ast.expr.unaryoperators;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.runtime.Scope;

public class NotOperatorNode extends UnaryOperatorNode {

	public NotOperatorNode(ExpressionNode node) {
		super(node);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		if (getNode().interpret(scope) == 1) {
			return 0;
		} else {
			if (getNode().interpret(scope) == 0) {
				return 1;
			} else {
				throw new SeaOfOberonException("Not Operator node did not return a boolean value");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("NOT" + ident);
		sb.append(getNode().toTreeString(ident));
		return sb.toString();
	}

}
