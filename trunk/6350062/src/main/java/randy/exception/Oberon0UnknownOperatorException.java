package randy.exception;

public class Oberon0UnknownOperatorException extends Oberon0Exception
{
	private static final long serialVersionUID = -4155406695506547030L;

	public Oberon0UnknownOperatorException(String operator)
	{
		super("The operator '" + operator + "' is not recognized.");
	}
}
