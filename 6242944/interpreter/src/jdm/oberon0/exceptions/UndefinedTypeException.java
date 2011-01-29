package jdm.oberon0.exceptions;

/**
 * Exception raised when an unknown type is used.
 */
public class UndefinedTypeException extends RuntimeException {
	
	private static final long serialVersionUID = 8341034759202159272L;

	public UndefinedTypeException(String type) {
		super(type);
	}
}
