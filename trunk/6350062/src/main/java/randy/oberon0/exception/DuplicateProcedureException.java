package randy.oberon0.exception;

public class DuplicateProcedureException extends TypeCheckException
{
	private static final long serialVersionUID = 6790941160469815172L;

	public DuplicateProcedureException(String name)
	{
		super("Duplicate procedure '" + name + "'.");
	}
}
