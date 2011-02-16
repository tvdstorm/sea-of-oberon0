package oberon.typechecker;

/**
 * The Class VariableCannotBeAssignedToError.
 */
public class VariableCannotBeAssignedToError extends AbstractError {

	/** The variable name. */
	private final String variableName;
	
	/** The scope name. */
	private final String scopeName;

	/**
	 * Instantiates a new variable cannot be assigned to error.
	 *
	 * @param variableName the variable name
	 * @param scopeName the scope name
	 */
	public VariableCannotBeAssignedToError(String variableName, String scopeName) {
		this.variableName = variableName;
		this.scopeName = scopeName;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return "Variable: " + variableName +", in scope: " + scopeName +" cannot be assigned to directly";
	}

}
