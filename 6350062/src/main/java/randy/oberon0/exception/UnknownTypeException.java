package randy.oberon0.exception;

public class UnknownTypeException extends TypeCheckException
{
	private static final long serialVersionUID = -616215702838518101L;

	public UnknownTypeException(String type)
	{
		super("Encountered unknown type '" + type + "'.");
	}
}
