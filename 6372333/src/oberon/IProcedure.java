package oberon;

import java.io.IOException;
import java.util.Queue;

import oberon.exceptions.UnsupportedException;
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
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract void call(Scope currentScope, Queue<IExpression> localQueue) throws IOException, UnsupportedException, VariableNotFoundInScopeException;

}