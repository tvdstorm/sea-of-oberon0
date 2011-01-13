package randy.exception;

public class Oberon0IncorrectNumberOfArgumentsException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -1783524693085741233L;

	public Oberon0IncorrectNumberOfArgumentsException()
	{
		super("The number of given parameters doesn't match the number of required parameters.");
	}
}
