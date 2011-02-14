package oberon.typechecker;

public class InvalidVariableInWithStatementError extends AbstractError {

	private final String variableText;

	public InvalidVariableInWithStatementError(String variableText) {
		this.variableText = variableText;
	}

	@Override
	public String toString() {
		return "The variable: " + variableText + ", cannot be used in a with statement as it's not a record";
	}

}
