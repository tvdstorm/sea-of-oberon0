package randy.oberon0.exception;

public class Oberon0DuplicateFunctionException extends Oberon0Exception
{
	private static final long serialVersionUID = 6790941160469815172L;

	public Oberon0DuplicateFunctionException(String name)
	{
		super("Duplicate function '" + name + "'.");
	}
}
