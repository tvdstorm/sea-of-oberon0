package randy.exception;

public class Oberon0DivideByZeroException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -4159989324523927242L;

	public Oberon0DivideByZeroException()
	{
		super("Divide by zero.");
	}
}
