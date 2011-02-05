package oberon;

/**
 * The Interface IDataType, used for all data types.
 */
public interface IDataType {

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public abstract int getValue();

	/**
	 * Copy.
	 *
	 * @param newName the new name of the copy
	 * @return copy of the current instance
	 */
	public abstract IDataType copy(String newName);

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