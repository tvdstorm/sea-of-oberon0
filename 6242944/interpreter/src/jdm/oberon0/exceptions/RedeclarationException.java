package jdm.oberon0.exceptions;

/**
 * Exception raised when two entities have the same name in the current scope.
 */
public class RedeclarationException extends RuntimeException {
	
	private static final long serialVersionUID = 3159865993391915295L;

	public RedeclarationException(String name) {
		super(name);
	}
}
