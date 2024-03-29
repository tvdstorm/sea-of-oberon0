/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.ast.expr.IdentifierNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Represents an assignment node, example: x := 1 + 6
 * 
 * @author arieveek
 * 
 */
public class AssignmentNode implements ASTNode, StatementNode {

	private final IdentifierNode identifier;
	private final ExpressionNode expression;

	public AssignmentNode(IdentifierNode identifier, ExpressionNode expression) {
		this.identifier = identifier;
		this.expression = expression;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public void interpret(Scope scope) throws SeaOfOberonException {
		Integer result = expression.interpret(scope);
		scope.updateValue((IdentifierNode) identifier, result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append(identifier.toTreeString(ident));
		sb.append(ident + ":=" + ident);
		sb.append(expression.toTreeString(ident));
		return sb.toString();
	}
}
