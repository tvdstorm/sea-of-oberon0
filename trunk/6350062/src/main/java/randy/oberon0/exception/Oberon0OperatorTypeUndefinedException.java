package randy.oberon0.exception;

import randy.oberon0.value.Type;

public class Oberon0OperatorTypeUndefinedException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = -4452312422101125649L;

	public Oberon0OperatorTypeUndefinedException(String operator, Type rhsType)
	{
		super("The operator '" + operator + "' is undefined for the argument type " + rhsType + ".");
	}
}
