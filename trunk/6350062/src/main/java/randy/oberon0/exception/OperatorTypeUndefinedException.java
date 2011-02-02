package randy.oberon0.exception;

import randy.oberon0.value.Type;

public class OperatorTypeUndefinedException extends RuntimeException
{
	private static final long serialVersionUID = -4452312422101125649L;

	public OperatorTypeUndefinedException(String operator, Type rhsType)
	{
		super("The operator '" + operator + "' is undefined for the argument type " + rhsType + ".");
	}
	public OperatorTypeUndefinedException(String operator, Type lhsType, Type rhsType)
	{
		super("The operator '" + operator + "' is undefined for the argument types " + lhsType + " and " + rhsType + ".");
	}
}
