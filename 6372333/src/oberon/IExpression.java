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
	 * @param currentScope the current scope
	 * @param newName the new name
	 * @param isShallowCopy the is shallow copy
	 * @return copy of the current instance
	 * @throws UnsupportedException the unsupported exception
	 * @throws VariableNotFoundInScopeException the variable not found in scope exception
	 */
	public abstract IDataType copy(Scope currentScope, String newName, boolean isShallowCopy) throws UnsupportedException, VariableNotFoundInScopeException;

}