package randy.oberon0.exception;

public class UnknownRecordFieldAccess extends TypeCheckException
{
	private static final long serialVersionUID = 4461039899543169943L;

	public UnknownRecordFieldAccess(String memberName)
	{
		super("Trying to access field '" + memberName + "' of a record, which doesn't exist.");
	}
}
