package oberon;

import java.io.IOException;

import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Interface IStatement, interfaces all statements.
 */
public interface IStatement {

	/**
	 * Evaluates the statement.
	 *
	 * @throws IOException When reading from the command line fails
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract void eval(Scope currentScope) throws IOException;

}