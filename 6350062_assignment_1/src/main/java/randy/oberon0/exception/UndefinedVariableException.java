package randy.oberon0.exception;

public class UndefinedVariableException extends RuntimeException
{
	private static final long serialVersionUID = -7821065150506466658L;

	// TODO: verwijderen
	public UndefinedVariableException(String name)
	{
		super("The variable '" + name + "' is undefined.");
	}
}
