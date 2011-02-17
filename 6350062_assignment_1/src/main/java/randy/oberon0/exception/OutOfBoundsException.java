package randy.oberon0.exception;

public class OutOfBoundsException extends RuntimeException
{
	private static final long serialVersionUID = -7869116783585406577L;

	public OutOfBoundsException(int arrayIndex)
	{
		super("Index '" + arrayIndex + "' is out of bounds.");
	}
}
