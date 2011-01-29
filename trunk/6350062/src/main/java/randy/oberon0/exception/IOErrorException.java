package randy.oberon0.exception;

public class IOErrorException extends RuntimeException
{
	private static final long serialVersionUID = 658903074417115413L;

	public IOErrorException(String message)
	{
		super(message);
	}
}
