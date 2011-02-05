package oberon;

import oberon.exceptions.UnsupportedException;

/**
 * The Interface IExpression, interfaces all expressions.
 */
public interface IExpression {

	/**
	 * Evaluat the expression as int.
	 *
	 * @return the int
	 * @throws UnsupportedException 
	 */
	public abstract int evalAsInt() throws UnsupportedException;

	/**
	 * Evaluate the expression as boolean.
	 *
	 * @return the boolean
	 * @throws UnsupportedException 
	 */
	public abstract Boolean evalAsBoolean() throws UnsupportedException;

	/**
	 * Copy.
	 *
	 * @param the new name of the copy
	 * @return copy of the current instance
	 * @throws UnsupportedException 
	 */
	public abstract IDataType copy(String newName) throws UnsupportedException;

}