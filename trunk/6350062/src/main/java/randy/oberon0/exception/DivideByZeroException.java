package randy.oberon0.exception;

public class DivideByZeroException extends RuntimeException
{
	private static final long serialVersionUID = -4159989324523927242L;

	public DivideByZeroException()
	{
		super("Divide by zero.");
	}
}
