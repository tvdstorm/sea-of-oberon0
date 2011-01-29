package randy.oberon0.exception;

import randy.oberon0.value.Type;

public class Oberon0TypeMismatchException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = 4603625113844921499L;

	public Oberon0TypeMismatchException(Type fromType, Type toType)
	{
		super("Type mismatch: cannot convert from " + fromType + " to " + toType + ".");
	}
	public Oberon0TypeMismatchException(Type fromType, String toType)
	{
		super("Type mismatch: cannot convert from " + fromType + " to " + toType + ".");
	}
}
