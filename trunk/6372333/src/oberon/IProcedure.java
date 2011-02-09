package oberon;

import java.io.IOException;
import java.util.List;

import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Interface IProcedure, interfaces all procedures.
 */
public interface IProcedure {

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * Call.
	 *
	 * @param localQueue Queue with the actual parameters
	 * @throws IOException When reading from the command line fails.
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract void call(Scope currentScope, List<IExpression> localQueue) throws IOException;

}