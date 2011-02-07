package oberon;

import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;

/**
 * The Interface IDataType, used for all data types.
 */
public interface IDataType {

	/**
	 * Gets the value.
	 *
	 * @return the value
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract int getValue(Scope currentScope) throws UnsupportedException, VariableNotFoundInScopeException;

	/**
	 * Copy.
	 *
	 * @param newName the new name of the copy
	 * @return copy of the current instance
	 */
	public abstract IDataType copy(final String newName);

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