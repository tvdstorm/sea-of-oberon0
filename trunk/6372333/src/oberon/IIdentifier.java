package oberon;

import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;


/**
 * The Interface IIdentifier, interfaces all variable identifiers.
 */
public interface IIdentifier {

	/**
	 * Gets the data type value.
	 *
	 * @return data type value for the variable
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract IDataType getDataTypeValue(Scope currentScope);

	/**
	 * Gets the value.
	 *
	 * @return the value of the variable
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract int getValue(Scope currentScope);

}