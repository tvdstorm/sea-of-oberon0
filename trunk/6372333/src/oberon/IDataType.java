package oberon;

import oberon.exceptions.ProcedureParamaterCountMismatchException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Interface IDataType, used for all data types.
 */
public interface IDataType {

	/**
	 * Gets the value.
	 *
	 * @return the value
	 * @throws ProcedureParamaterCountMismatchException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract int getValue(Scope currentScope);

	/**
	 * Copy.
	 *
	 * @param newName the new name of the copy
	 * @return copy of the current instance
	 */
	public abstract IDataType performDeepCopy(final String newName);

	/**
	 * Copy.
	 *
	 * @param newName the new name of the copy
	 * @return copy of the current instance
	 */
	public abstract IDataType performShallowCopy(final String newName);

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public abstract String getName();

	/**
	 * Sets the value.
	 *
	 * @param the new value
	 */
	public abstract void setValue(final int value);

}