package oberon;

import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Interface IExpression, interfaces all expressions.
 */
public interface IExpression {

	/**
	 * Evaluat the expression as int.
	 *
	 * @return the int
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract int evalAsInt(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException;

	/**
	 * Evaluate the expression as boolean.
	 *
	 * @return the boolean
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract Boolean evalAsBoolean(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException;

	/**
	 * Copy.
	 *
	 * @param the new name of the copy
	 * @return copy of the current instance
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract IDataType copy(Scope currentScope, String newName) throws UnsupportedException, VariableNotFoundInScopeException;

}