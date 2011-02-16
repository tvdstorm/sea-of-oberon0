package oberon.typechecker;

/**
 * The Class ProcedureNotFoundError.
 */
public class ProcedureNotFoundError extends AbstractError {

	/** The scope name. */
	private final String scopeName;
	
	/** The procedure name. */
	private final String procedureName;

	/**
	 * Instantiates a new procedure not found error.
	 *
	 * @param procedureName the procedure name
	 * @param scopeName the scope name
	 */
	public ProcedureNotFoundError(String procedureName, String scopeName) {
		this.procedureName = procedureName;
		this.scopeName = scopeName;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return "Procedure with name: " + procedureName + ", not found in scope: " + scopeName;
	}

}
