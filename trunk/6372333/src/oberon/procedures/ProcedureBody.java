package oberon.procedures;

import java.io.IOException;

import oberon.Scope;
import oberon.StatementSequence;
import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Class ProcedureBody, contains the body of a procedure.
 */
public class ProcedureBody {
	
	/** The body. */
	private final StatementSequence body;
	
	/** The variable declaration. */
	private final Declaration variableDeclaration;

	/**
	 * Instantiates a new procedure body.
	 *
	 * @param declaration the declaration for the procedure 
	 * @param statements the statements in the procedure
	 */
	public ProcedureBody(final Declaration declaration, final StatementSequence statements) {
		variableDeclaration = declaration;
		body = statements;
	}
	
	/**
	 * Evaluates the body of the procedure.
	 *
	 * @throws IOException throws when an exception occurs when reading from the console
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public void eval(final Scope currentScope) throws IOException {
		currentScope.addNewDeclaration(variableDeclaration);
		
		body.eval(currentScope);
	}

	/**
	 * Gets the statements.
	 *
	 * @return the statements
	 */
	public StatementSequence getStatements() {
		return body;
	}

	/**
	 * Gets the declaration.
	 *
	 * @return the declaration
	 */
	public Declaration getDeclaration() {
		return variableDeclaration;
	}
}
