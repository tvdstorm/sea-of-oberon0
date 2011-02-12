package oberon.exceptions;

public class BadWithStatementField extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8242167935310412737L;

	/**
	 * Instantiates a new bad with statement field.
	 *
	 * @param message the message
	 */
	public BadWithStatementField(final String message){
	    super(message);
	  }

}
