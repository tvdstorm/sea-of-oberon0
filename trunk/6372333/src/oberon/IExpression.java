package oberon;

import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Interface IExpression, interfaces all expressions.
 */
public interface IExpression {

	/**
	 * Evaluat the expression as int.
	 *
	 * @return the int
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract int evalAsInt(Scope currentScope);

	/**
	 * Evaluate the expression as boolean.
	 *
	 * @return the boolean
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract Boolean evalAsBoolean(Scope currentScope);

	/**
	 * Copy.
	 *
	 * @param currentScope the current scope
	 * @param newName the new name
	 * @param isShallowCopy the is shallow copy
	 * @return copy of the current instance
	 * @throws ProcedureParamaterCountMismatchException the unsupported exception
	 * @throws VariableNotFoundInScopeException the variable not found in scope exception
	 */
	public abstract IDataType copy(Scope currentScope, String newName, boolean isShallowCopy);
	
	/**
	 * Gets the expression as text.
	 *
	 * @return the text
	 */
	public abstract String getText();

}