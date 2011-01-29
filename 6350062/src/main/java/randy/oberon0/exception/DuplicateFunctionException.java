package randy.oberon0.exception;

public class DuplicateFunctionException extends Exception
{
	private static final long serialVersionUID = 6790941160469815172L;

	public DuplicateFunctionException(String name)
	{
		super("Duplicate function '" + name + "'.");
	}
}
