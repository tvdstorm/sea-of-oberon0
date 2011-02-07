package oberon.exceptions;

public class VariableNotFoundInScopeException extends RuntimeException {

	public VariableNotFoundInScopeException(String variableName){
		super("Variable was not found in current scope, variable name: " + variableName);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8817943661053595229L;

}
