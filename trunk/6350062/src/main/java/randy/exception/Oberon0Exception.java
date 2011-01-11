package randy.exception;

public class Oberon0Exception extends Exception
{
	private static final long serialVersionUID = -5755268459412788158L;
	private String message;

	public Oberon0Exception()
	{
		
	}
	public Oberon0Exception(String _message)
	{
		message = _message;
	}
	public String getMessage()
	{
		return message;
	}
	public String toString()
	{
		return this.getClass().toString() + ": " + message;
	}
}
