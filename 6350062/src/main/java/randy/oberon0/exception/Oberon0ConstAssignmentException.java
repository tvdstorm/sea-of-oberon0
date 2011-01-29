package randy.oberon0.exception;

public class Oberon0ConstAssignmentException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -6829449544731602719L;

	public Oberon0ConstAssignmentException()
	{
		super("Can't assign a value after a const variable has been declared.");
	}
}
