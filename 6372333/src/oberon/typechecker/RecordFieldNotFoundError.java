package oberon.typechecker;

/**
 * The Class RecordFieldNotFoundError.
 */
public class RecordFieldNotFoundError extends AbstractError {

	/** The record field. */
	private final String recordField;
	
	/** The scope name. */
	private String scopeName;

	/**
	 * Instantiates a new record field not found error.
	 *
	 * @param recordField the record field
	 * @param scopeName the scope name
	 */
	public RecordFieldNotFoundError(String recordField, String scopeName) {
		this.recordField = recordField;
		this.scopeName = scopeName;
	}

	/* (non-Javadoc)
	 * @see oberon.typechecker.AbstractError#toString()
	 */
	@Override
	public String toString() {
		return "Record field: " + recordField + ", was not found in scope: " + scopeName;
	}

}
