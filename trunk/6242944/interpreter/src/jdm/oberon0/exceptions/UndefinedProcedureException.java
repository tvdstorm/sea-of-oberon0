package jdm.oberon0.exceptions;

/**
 * Exception raised when an unknown procedure is used.
 */
public class UndefinedProcedureException extends RuntimeException {
	
	private static final long serialVersionUID = -3103043131331597786L;

	public UndefinedProcedureException(String name) {
		super(name);
	}
}
