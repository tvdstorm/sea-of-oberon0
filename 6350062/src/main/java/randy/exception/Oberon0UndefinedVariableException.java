package randy.exception;

public class Oberon0UndefinedVariableException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -7821065150506466658L;

	public Oberon0UndefinedVariableException(String name)
	{
		super("The variable '" + name + "' is undefined.");
	}
}
