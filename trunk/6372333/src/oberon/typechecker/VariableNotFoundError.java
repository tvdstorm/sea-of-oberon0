package oberon.typechecker;

/**
 * The Class VariableNotFoundError.
 */
public class VariableNotFoundError extends AbstractError {

	/** The scope name. */
	private final String scopeName;
	
	/** The variable name. */
	private final String variableName;

	/**
	 * Instantiates a new variable not found error.
	 *
	 * @param variableName the variable name
	 * @param scopeName the scope name
	 */
	public VariableNotFoundError(String variableName, String scopeName) {
		this.variableName = variableName;
		this.scopeName = scopeName;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return "Variable: " + variableName +", not found in scope: "+ scopeName;
	}

}
