package oberon.typechecker;

public class RecordFieldNotFoundError extends AbstractError {

	private final String recordField;
	private String scopeName;

	public RecordFieldNotFoundError(String recordField, String scopeName) {
		this.recordField = recordField;
		this.scopeName = scopeName;
	}

	@Override
	public String toString() {
		return "Record field: " + recordField + ", was not found in scope: " + scopeName;
	}

}
