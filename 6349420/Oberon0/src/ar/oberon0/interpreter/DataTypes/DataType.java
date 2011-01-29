package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Interpretable;

/*
 * A datatype is used to store data. for example an integer.
 */
public interface DataType extends Interpretable, Comparable<DataType>
{
	/*
	 * Multiply the current value with the value of the parameter.
	 */
	public DataType MultiplyBy(DataType value) throws Exception;

	/*
	 * Return the sum of the current value and the value of the parameter.
	 */
	public DataType Add(DataType value) throws Exception;

	/*
	 * Return the negation of the current value.
	 */
	public DataType Negate();

	/*
	 * Return the subtraction of the parameter value from the current value.
	 */
	public DataType Subtract(DataType value) throws Exception;

	/*
	 * Divide the current value by the value of the parameter.
	 */
	public DataType Divide(DataType value) throws Exception;

	/*
	 * Return the module of the current value by the value of the parameter.
	 */
	public DataType Modulo(DataType value) throws Exception;

	/*
	 * Return the Type of the current object.
	 */
	public CreatableType getType();
}
