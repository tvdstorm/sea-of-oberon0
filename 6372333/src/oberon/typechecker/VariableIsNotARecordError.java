package oberon.typechecker;

/**
 * The Class VariableIsNotARecordError.
 */
public class VariableIsNotARecordError extends AbstractError {

	/** The record name. */
	private final String recordName;
	
	/** The scope name. */
	private String scopeName;

	/**
	 * Instantiates a new variable is not a record error.
	 *
	 * @param recordName the record name
	 * @param scopeName the scope name
	 */
	public VariableIsNotARecordError(String recordName, String scopeName) {
		this.recordName = recordName;
		this.scopeName = scopeName;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return "Variable: " + recordName + ", was not found in scope: " + scopeName;
	}

}
