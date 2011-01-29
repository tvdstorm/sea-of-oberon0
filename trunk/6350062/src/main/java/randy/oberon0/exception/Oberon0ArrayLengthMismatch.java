package randy.oberon0.exception;

public class Oberon0ArrayLengthMismatch extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -7107246067615522083L;

	public Oberon0ArrayLengthMismatch()
	{
		super("Array length doesn't match the assigned array length.");
	}
}
