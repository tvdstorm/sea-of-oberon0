package randy.oberon0.exception;

public class UnreachableRuntimeException extends RuntimeException
{
	private static final long serialVersionUID = -1825395027970676782L;

	public UnreachableRuntimeException()
	{
		super("Unreachable code has been executed!");
		assert(false);
	}
}
