package randy.exception;

public class Oberon0OutOfBoundsException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -7869116783585406577L;

	public Oberon0OutOfBoundsException(int arrayIndex)
	{
		super("Index '" + arrayIndex + "' is out of bounds.");
	}
}
