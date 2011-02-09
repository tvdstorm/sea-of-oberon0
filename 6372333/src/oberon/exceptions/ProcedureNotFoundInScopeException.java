package oberon.exceptions;

public class ProcedureNotFoundInScopeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8205390151823804403L;

	public ProcedureNotFoundInScopeException(final String message){
	    super(message);
	  }

}
