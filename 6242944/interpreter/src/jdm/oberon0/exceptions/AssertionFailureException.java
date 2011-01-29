package jdm.oberon0.exceptions;

/**
 * Exception raised when an assertion written in Oberon0 fails.
 */
public class AssertionFailureException extends RuntimeException {
	
	private static final long serialVersionUID = -8146259941940397576L;

	public AssertionFailureException(String actual, String expected) {
		super("Got " + actual + ", expected " + expected);
	}
}
