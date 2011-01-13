package randy.exception;

import randy.ast.Type;

public class Oberon0OperatorTypeUndefinedException extends Oberon0Exception
{
	private static final long serialVersionUID = -4452312422101125649L;

	public Oberon0OperatorTypeUndefinedException(String operator, Type lhsType, Type rhsType)
	{
		super("The operator '" + operator + "' is undefined for the argument types " + lhsType + ", " + rhsType + ".");
	}
}
