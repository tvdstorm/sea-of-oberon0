package oberon.typechecker;

/**
 * The Class ParameterMismatchException.
 */
public class ParameterMismatchException extends AbstractError {

	/** The error string. */
	private final String errorString;

	/**
	 * Instantiates a new parameter mismatch exception.
	 *
	 * @param errorString the error string
	 */
	public ParameterMismatchException(String errorString) {
		this.errorString = errorString;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return errorString;
	}

}
