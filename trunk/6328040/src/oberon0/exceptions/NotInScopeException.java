package oberon0.exceptions;

public class NotInScopeException extends Exception {
	private static final long serialVersionUID = 1L;
	 
	public NotInScopeException (String symbolName, String scopeName){
		super("Called symbol '"+ symbolName+"' is undeclared or not in currentscope '"+ scopeName + "'");
	}
}
