package randy.exception;

public class Oberon0UndefinedMethodException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = 1881931495572680252L;

	public Oberon0UndefinedMethodException(String name)
	{
		super("The method '" + name + "' is undefined.");
	}
}
