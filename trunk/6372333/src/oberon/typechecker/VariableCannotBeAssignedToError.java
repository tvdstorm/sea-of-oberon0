package oberon.typechecker;

public class VariableCannotBeAssignedToError extends AbstractError {

	private final String variableName;
	private final String scopeName;

	public VariableCannotBeAssignedToError(String variableName, String scopeName) {
		this.variableName = variableName;
		this.scopeName = scopeName;
	}

	@Override
	public String toString() {
		return "Variable: " + variableName +", in scope: " + scopeName +" cannot be assigned to directly";
	}

}
