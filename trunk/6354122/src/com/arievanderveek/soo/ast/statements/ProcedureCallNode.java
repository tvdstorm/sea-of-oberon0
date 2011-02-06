/**
 * 
 */
package com.arievanderveek.soo.ast.statements;

import java.util.List;

import com.arievanderveek.soo.SeaOfOberonException;
import com.arievanderveek.soo.ast.ASTNode;
import com.arievanderveek.soo.ast.codeblocks.ProcedureNode;
import com.arievanderveek.soo.ast.variables.IdentifierNode;
import com.arievanderveek.soo.symboltable.Scope;

/**
 * @author arieveek
 * 
 */
public class ProcedureCallNode extends AbstractCallNode {

	/**
	 * @param identifier
	 */
	public ProcedureCallNode(ASTNode identifier) {
		super(identifier);
	}

	/**
	 * @param identifier
	 */
	public ProcedureCallNode(ASTNode identifier, List<ASTNode> parameters) {
		super(identifier, parameters);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.arievanderveek.soo.ast.ASTNode#interpret()
	 */
	@Override
	public Integer interpret(Scope scope) throws SeaOfOberonException {
		// First lookup the procedure in the scope
		String procedureName = ((IdentifierNode) identifier).getName();
		ProcedureNode procedure = (ProcedureNode) scope
				.getProcedure(procedureName);
		// Validate if the amout of parameters are the same
		if (!procedure.isAmountOfParametersEqual(parameters)) {
			throw new SeaOfOberonException(
					"Amount of parameters in procedure call does not match "
							+ "the declared amout of paramters for procedure:"
							+ procedureName);
		}
		// Create a new scope with the procedures, current parameters and the
		// current scope
		Scope scopeForProcedure = new Scope(scope, procedure, this.parameters);
		// Interpret the procedure with the new scope
		procedure.interpret(scopeForProcedure);
		// as we are done with the scope, pop the newly created scope from the
		// old scope
		// so varaibles are deallocated. If this is not done, you will have a
		// memory leak.
		scopeForProcedure.popScope();
		return null;
	}

}
