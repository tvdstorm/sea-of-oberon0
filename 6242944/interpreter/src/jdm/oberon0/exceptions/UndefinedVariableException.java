package jdm.oberon0.exceptions;

/**
 * Exception raised when an unknown variable is used.
 */
public class UndefinedVariableException extends RuntimeException {
	
	private static final long serialVersionUID = -1564666434331131813L;

	public UndefinedVariableException(String type) {
		super(type);
	}
}
