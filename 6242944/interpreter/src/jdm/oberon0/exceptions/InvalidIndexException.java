package jdm.oberon0.exceptions;

/**
 * Exception raised when an array index is invalid.
 */
public class InvalidIndexException extends RuntimeException {
	
	private static final long serialVersionUID = 1499664449796589900L;

	public InvalidIndexException(int index) {
		super("Invalid index: " + index);
	}
}
