package jdm.oberon0.exceptions;

/**
 * Exception raised when an unknown field is used.
 */
public class UndefinedFieldException extends RuntimeException {

	private static final long serialVersionUID = 5672492613505709558L;

	public UndefinedFieldException(String type) {
		super(type);
	}
}
