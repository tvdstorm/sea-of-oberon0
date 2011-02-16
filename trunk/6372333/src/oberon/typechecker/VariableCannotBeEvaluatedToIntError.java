package oberon.typechecker;

/**
 * The Class VariableCannotBeEvaluatedToIntError.
 */
public class VariableCannotBeEvaluatedToIntError extends AbstractError {

	/** The variable name. */
	private final String variableName;
	
	/** The scope name. */
	private final String scopeName;

	/**
	 * Instantiates a new variable cannot be evaluated to int error.
	 *
	 * @param variableName the variable name
	 * @param scopeName the scope name
	 */
	public VariableCannotBeEvaluatedToIntError(String variableName, String scopeName) {
		this.variableName = variableName;
		this.scopeName = scopeName;		
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return "Variable: " + variableName + ", in scope: " + scopeName + " cannot be evaluated to an int";
	}

}
