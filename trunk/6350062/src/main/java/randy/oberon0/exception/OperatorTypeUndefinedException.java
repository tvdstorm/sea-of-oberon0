package randy.oberon0.exception;

public class OperatorTypeUndefinedException extends TypeCheckException
{
	private static final long serialVersionUID = -4452312422101125649L;

	public OperatorTypeUndefinedException(String operator, String rightHandType)
	{
		super("The operator '" + operator + "' is undefined for the argument type " + rightHandType + ".");
	}
	public OperatorTypeUndefinedException(String operator, String leftHandType, String rightHandType)
	{
		super("The operator '" + operator + "' is undefined for the argument types " + leftHandType + " and " + rightHandType + ".");
	}
}
