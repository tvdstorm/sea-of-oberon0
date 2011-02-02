package randy.oberon0.exception;

public class OperatorTypeUndefinedException extends RuntimeException
{
	private static final long serialVersionUID = -4452312422101125649L;

	public OperatorTypeUndefinedException(String operator, String rhsType)
	{
		super("The operator '" + operator + "' is undefined for the argument type " + rhsType + ".");
	}
	public OperatorTypeUndefinedException(String operator, String lhsType, String rhsType)
	{
		super("The operator '" + operator + "' is undefined for the argument types " + lhsType + " and " + rhsType + ".");
	}
}
