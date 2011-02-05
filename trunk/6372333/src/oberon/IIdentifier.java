package oberon;

import oberon.exceptions.UnsupportedException;


/**
 * The Interface IIdentifier, interfaces all variable identifiers.
 */
public interface IIdentifier {

	/**
	 * Gets the data type value.
	 *
	 * @return data type value for the variable
	 * @throws UnsupportedException 
	 */
	public abstract IDataType getDataTypeValue() throws UnsupportedException;

	/**
	 * Gets the value.
	 *
	 * @return the value of the variable
	 * @throws UnsupportedException 
	 */
	public abstract int getValue() throws UnsupportedException;

}