package randy.oberon0.exception;

public abstract class RuntimeException extends Exception
{
	private static final long serialVersionUID = -896489298759186598L;
	
	protected RuntimeException(String message)
	{
		super(message);
	}
}
