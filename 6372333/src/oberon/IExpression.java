package oberon;

/**
 * The Interface IExpression, interfaces all expressions.
 */
public interface IExpression {

	/**
	 * Evaluat the expression as int.
	 *
	 * @return the int
	 */
	public abstract int evalAsInt();

	/**
	 * Evaluate the expression as boolean.
	 *
	 * @return the boolean
	 */
	public abstract Boolean evalAsBoolean();

	/**
	 * Copy.
	 *
	 * @param the new name of the copy
	 * @return copy of the current instance
	 */
	public abstract IDataType copy(String newName);

}