package randy.exception;

import randy.ast.Type;

public class Oberon0TypeMismatchException extends Oberon0RuntimeException
{
	private static final long serialVersionUID = 4603625113844921499L;

	public Oberon0TypeMismatchException(Type fromType, Type toType)
	{
		super("Type mismatch: cannot convert from " + fromType + " to " + toType + ".");
	}
}
