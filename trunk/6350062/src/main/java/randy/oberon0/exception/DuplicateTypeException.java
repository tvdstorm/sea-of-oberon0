package randy.oberon0.exception;

public class DuplicateTypeException extends RuntimeException
{
	private static final long serialVersionUID = -5302915287227899469L;

	public DuplicateTypeException(String name)
	{
		super("Duplicate type '" + name + "'.");
	}
}
