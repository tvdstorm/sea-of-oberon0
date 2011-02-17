package randy.oberon0.exception;

public class ArrayLengthMismatch extends RuntimeException
{
	private static final long serialVersionUID = -7107246067615522083L;

	public ArrayLengthMismatch()
	{
		super("Array length doesn't match the assigned array length.");
	}
}
