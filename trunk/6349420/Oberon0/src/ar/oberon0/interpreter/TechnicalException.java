package ar.oberon0.interpreter;

/*
 * The technical exception is used to indicate an exception that occured in the interpreter.
 * The default exception message is used for the message. If this exception is thrown it comes from the Interpreter.
 */
public class TechnicalException extends Exception
{
	public TechnicalException(String message)
	{
		super(message);
	}

}
