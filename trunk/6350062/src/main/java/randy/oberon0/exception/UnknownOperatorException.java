package randy.oberon0.exception;

public class UnknownOperatorException extends Exception
{
	private static final long serialVersionUID = -4155406695506547030L;

	public UnknownOperatorException(String operator)
	{
		super("The operator '" + operator + "' is not recognized.");
	}
}
