package oberon0.exceptions;

public class IllegalVariableValueException extends Exception {
	private static final long serialVersionUID = 1L;
	 
	public IllegalVariableValueException (String variableType, String newValue){
		super("Unable to assign value "+ newValue + " to variable of type " + variableType);
	}
}
