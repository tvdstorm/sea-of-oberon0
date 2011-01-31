package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.TechnicalException;

/*
 * When a class implements this interface it means that it can do arithmetic calculations.
 */
public interface ArithmeticValue extends Value {
	/*
	 * Multiply the current value with the value of the parameter.
	 */
	Value multiplyBy(Value value) throws TechnicalException;

	/*
	 * Return the sum of the current value and the value of the parameter.
	 */
	Value add(Value value) throws TechnicalException;

	/*
	 * Return the negation of the current value.
	 */
	Value negate();

	/*
	 * Return the subtraction of the parameter value from the current value.
	 */
	Value subtract(Value value) throws TechnicalException;

	/*
	 * Divide the current value by the value of the parameter.
	 */
	Value divide(Value value) throws TechnicalException;

	/*
	 * Return the module of the current value by the value of the parameter.
	 */
	Value modulo(Value value) throws TechnicalException;

}
