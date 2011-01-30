package randy.oberon0.exception;

import randy.oberon0.value.Type;

public class TypeMismatchException extends RuntimeException
{
	private static final long serialVersionUID = 4603625113844921499L;

	public TypeMismatchException(Type fromType, Type toType)
	{
		super("Type mismatch: cannot convert from " + fromType + " to " + toType + ".");
	}
}
