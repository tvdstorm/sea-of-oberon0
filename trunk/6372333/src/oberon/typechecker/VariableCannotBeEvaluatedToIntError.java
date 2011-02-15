package oberon.typechecker;

public class VariableCannotBeEvaluatedToIntError extends AbstractError {

	private final String variableName;
	private final String scopeName;

	public VariableCannotBeEvaluatedToIntError(String variableName, String scopeName) {
		this.variableName = variableName;
		this.scopeName = scopeName;		
	}

	@Override
	public String toString() {
		return "Variable: " + variableName + ", in scope: " + scopeName + " cannot be evaluated to an int";
	}

}
