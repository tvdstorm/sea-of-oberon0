package randy.oberon0.exception;

public class UndefinedBindableException extends RuntimeException
{
	private static final long serialVersionUID = -3588320410165517986L;

	public UndefinedBindableException(String name)
	{
		super("The procedure or variable '" + name + "' is undefined.");
	}
}
