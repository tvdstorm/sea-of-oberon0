package randy.oberon0.exception;

public abstract class TypeCheckException extends Exception
{
	private static final long serialVersionUID = -4138079507727566510L;

	protected TypeCheckException(String message)
	{
		super(message);
	}
}
