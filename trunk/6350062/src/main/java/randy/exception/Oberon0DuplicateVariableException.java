package randy.exception;

public class Oberon0DuplicateVariableException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -5314325215276110162L;

	public Oberon0DuplicateVariableException(String name)
	{
		super("Duplicate variable '" + name + "'.");
	}
}
