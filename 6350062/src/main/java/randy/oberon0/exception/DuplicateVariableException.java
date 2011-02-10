package randy.oberon0.exception;

public class DuplicateVariableException extends TypeCheckException
{
	private static final long serialVersionUID = -5314325215276110162L;

	public DuplicateVariableException(String name)
	{
		super("Duplicate variable '" + name + "'.");
	}
}
