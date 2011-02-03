package ar.oberon0.shared;

/*
 * The technical exception is used to indicate an exception that occured in the interpreter.
 * The default exception message is used for the message. If this exception is thrown it comes from the Interpreter.
 */
public class TechnicalException extends RuntimeException {
	public TechnicalException(String message) {
		super(message);
	}

}
