package randy.exception;

import randy.value.Type;

public class Oberon0OperatorTypeUndefinedException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -4452312422101125649L;

	public Oberon0OperatorTypeUndefinedException(String operator, Type rhsType)
	{
		super("The prefix operator '" + operator + "' is undefined for the argument type " + rhsType + ".");
	}
}
