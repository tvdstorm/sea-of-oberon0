package oberon;

import oberon.exceptions.UnsupportedException;
import oberon.exceptions.VariableNotFoundInScopeException;


/**
 * The Interface IIdentifier, interfaces all variable identifiers.
 */
public interface IIdentifier {

	/**
	 * Gets the data type value.
	 *
	 * @return data type value for the variable
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract IDataType getDataTypeValue() throws UnsupportedException, VariableNotFoundInScopeException;

	/**
	 * Gets the value.
	 *
	 * @return the value of the variable
	 * @throws UnsupportedException 
	 * @throws VariableNotFoundInScopeException 
	 */
	public abstract int getValue() throws UnsupportedException, VariableNotFoundInScopeException;

}