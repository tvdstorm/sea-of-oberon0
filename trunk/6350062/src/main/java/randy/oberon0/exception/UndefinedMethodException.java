package randy.oberon0.exception;

public class UndefinedMethodException extends RuntimeException
{
	private static final long serialVersionUID = 1881931495572680252L;

	public UndefinedMethodException(String name)
	{
		super("The method '" + name + "' is undefined.");
	}
}
