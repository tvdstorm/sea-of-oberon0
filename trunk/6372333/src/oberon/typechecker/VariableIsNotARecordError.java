package oberon.typechecker;

public class VariableIsNotARecordError extends AbstractError {

	private final String recordName;
	private String scopeName;

	public VariableIsNotARecordError(String recordName, String scopeName) {
		this.recordName = recordName;
		this.scopeName = scopeName;
	}

	@Override
	public String toString() {
		return "Variable: " + recordName + ", was not found in scope: " + scopeName;
	}

}
