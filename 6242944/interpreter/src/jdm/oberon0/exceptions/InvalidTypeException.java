package jdm.oberon0.exceptions;

/**
 * Exception raised when a type is used incorrectly.
 */
public class InvalidTypeException extends RuntimeException {
	
	private static final long serialVersionUID = -387633791138958256L;

	public InvalidTypeException(String type) {
		super(type);
	}
}
