package randy.oberon0.ast.expression;

public class ValueToReferenceConversion extends RuntimeException
{
	private static final long serialVersionUID = 7495410189013902915L;

	public ValueToReferenceConversion()
	{
		super("Trying to convert a value to a reference, which is not possible.");
	}
}
