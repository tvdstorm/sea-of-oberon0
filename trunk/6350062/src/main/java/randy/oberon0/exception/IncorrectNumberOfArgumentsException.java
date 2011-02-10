package randy.oberon0.exception;

public class IncorrectNumberOfArgumentsException extends TypeCheckException
{
	private static final long serialVersionUID = -1783524693085741233L;

	public IncorrectNumberOfArgumentsException()
	{
		super("The number of given parameters doesn't match the number of required parameters.");
	}
}
