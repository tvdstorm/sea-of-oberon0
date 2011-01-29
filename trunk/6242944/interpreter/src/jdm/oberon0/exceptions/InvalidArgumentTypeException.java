package jdm.oberon0.exceptions;

/**
 * Exception raised when procedure is passed an argument with invalid type.
 */
public class InvalidArgumentTypeException extends RuntimeException {
	
	private static final long serialVersionUID = -4954655764078669593L;

	public InvalidArgumentTypeException(int argument) {
		super("Invalid argument type for argument " + argument);
	}
}
