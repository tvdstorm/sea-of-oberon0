package oberon.typechecker;

/**
 * The Class InvalidVariableInWithStatementError.
 */
public class InvalidVariableInWithStatementError extends AbstractError {

	/** The variable text. */
	private final String variableText;

	/**
	 * Instantiates a new invalid variable in with statement error.
	 *
	 * @param variableText the variable text
	 */
	public InvalidVariableInWithStatementError(String variableText) {
		this.variableText = variableText;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return "The variable: " + variableText + ", cannot be used in a with statement as it's not a record";
	}

}
