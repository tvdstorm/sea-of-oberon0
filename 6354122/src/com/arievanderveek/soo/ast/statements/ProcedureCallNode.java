/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.LinkedList;
import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.codeblocks.ProcedureNode;
import com.arievanderveek.soo.ast.expr.ExpressionNode;
import com.arievanderveek.soo.ast.expr.IdentifierNode;
import com.arievanderveek.soo.runtime.Scope;

/**
 * Represents a procedure call
 * 
 * @author arieveek
 * 
 */
public class ProcedureCallNode implements ASTNode, StatementNode {

	protected final IdentifierNode identifier;
	protected final List<ExpressionNode> parameters;

	/**
	 * @param identifier
	 */
	public ProcedureCallNode(IdentifierNode identifier) {
		this.identifier = identifier;
		// Create an empty list, so it does not return null.
		this.parameters = new LinkedList<ExpressionNode>();
	}

	/**
	 * @param identifier
	 */
	public ProcedureCallNode(IdentifierNode identifier, List<ExpressionNode> parameters) {
		this.identifier = identifier;
		this.parameters = parameters;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public void interpret(Scope scope) throws SeaOfOberonException {
		// First lookup the procedure in the scope
		String procedureName = identifier.getName();
		ProcedureNode procedure = scope.getProcedure(procedureName);
		// Validate if the amount of parameters are the same
		if (!procedure.isAmountOfParametersEqual(parameters)) {
			throw new SeaOfOberonException("Amount of parameters in procedure call does not match "
					+ "the declared amout of paramters for procedure:" + procedureName);
		}
		// Create a new scope with the procedures, current parameters and the
		// current scope
		Scope scopeForProcedure = new Scope(scope, procedure, this.parameters);
		// Interpret the procedure with the new scope
		procedure.interpret(scopeForProcedure);
		// Done with the scope, pop the newly created scope from the old scope
		// so variables are deallocated.
		scopeForProcedure.popScope();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#toTreeString(java.lang.String)
	 */
	@Override
	public String toTreeString(String ident) throws SeaOfOberonException {
		StringBuilder sb = new StringBuilder();
		sb.append("Procedure" + ident);
		sb.append(identifier.toTreeString(ident));
		sb.append(ident + "(" + ident);
		for (ExpressionNode node : parameters) {
			sb.append(node.toTreeString(ident));
			sb.append(",");
		}
		sb.append(ident + ")");
		return sb.toString();
	}

}