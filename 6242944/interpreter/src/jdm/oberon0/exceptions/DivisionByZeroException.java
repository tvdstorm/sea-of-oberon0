package jdm.oberon0.exceptions;

/**
 * Exception raised when dividing by zero.
 */
public class DivisionByZeroException extends RuntimeException {
	
	private static final long serialVersionUID = 5469959993623165162L;

	public DivisionByZeroException() {
		super("Division or modulo by zero");
	}
}
