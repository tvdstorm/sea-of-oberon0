package oberon;


/**
 * The Interface IIdentifier, interfaces all variable identifiers.
 */
public interface IIdentifier {

	/**
	 * Gets the data type value.
	 *
	 * @return data type value for the variable
	 */
	public abstract IDataType getDataTypeValue();

	/**
	 * Gets the value.
	 *
	 * @return the value of the variable
	 */
	public abstract int getValue();

}