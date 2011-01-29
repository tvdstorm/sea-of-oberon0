package jdm.oberon0.exceptions;

/**
 * Exception raised when stdin input has invalid format.
 */
public class InvalidInputException extends RuntimeException {

	private static final long serialVersionUID = -5280426672115001407L;

	public InvalidInputException(String type) {
		super(type);
	}
}
