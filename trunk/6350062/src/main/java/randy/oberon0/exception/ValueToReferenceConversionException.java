package randy.oberon0.exception;

public class ValueToReferenceConversionException extends TypeCheckException
{
	private static final long serialVersionUID = 7495410189013902915L;

	public ValueToReferenceConversionException()
	{
		super("Trying to convert a value to a reference, which is not possible.");
	}
}
