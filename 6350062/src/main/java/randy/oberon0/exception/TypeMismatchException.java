package randy.oberon0.exception;

public class TypeMismatchException extends TypeCheckException
{
	private static final long serialVersionUID = 4603625113844921499L;

	public TypeMismatchException(String fromType, String toType)
	{
		super("Type mismatch: cannot convert from " + fromType + " to " + toType + ".");
	}
}
