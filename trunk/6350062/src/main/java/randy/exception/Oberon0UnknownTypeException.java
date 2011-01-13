package randy.exception;

public class Oberon0UnknownTypeException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -616215702838518101L;

	public Oberon0UnknownTypeException(String type)
	{
		super("Encountered unknown type '" + type + "'.");
	}
}
