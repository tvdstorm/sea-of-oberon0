package oberon.typechecker;

public class VariableNotFoundError extends AbstractError {

	private final String scopeName;
	private final String variableName;

	public VariableNotFoundError(String variableName, String scopeName) {
		this.variableName = variableName;
		this.scopeName = scopeName;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Variable: " + variableName +", not found in scope: "+ scopeName;
	}

}
