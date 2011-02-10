package randy.oberon0.exception;

public class ConstAssignmentException extends TypeCheckException
{
	private static final long serialVersionUID = -6829449544731602719L;

	public ConstAssignmentException()
	{
		super("Can't assign a value after a const variable has been declared.");
	}
}
