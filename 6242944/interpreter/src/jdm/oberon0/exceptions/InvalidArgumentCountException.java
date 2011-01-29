package jdm.oberon0.exceptions;

/**
 * Exception raised when procedure is passed an invalid number of 
 * arguments 
 */
public class InvalidArgumentCountException extends RuntimeException {
	
	private static final long serialVersionUID = -4005446801467123428L;

	public InvalidArgumentCountException(int actual, int expected) {
		super("Invalid argument count (" + actual + "), expected " + expected);
	}
}
