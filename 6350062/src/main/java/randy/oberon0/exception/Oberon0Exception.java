package randy.oberon0.exception;

public abstract class Oberon0Exception extends Exception
{
	private static final long serialVersionUID = -5755268459412788158L;

	public Oberon0Exception(String message)
	{
		super(message);
	}
}