package oberon;

import java.io.IOException;

import oberon.exceptions.UnsupportedException;

/**
 * The Interface IStatement, interfaces all statements.
 */
public interface IStatement {

	/**
	 * Evaluates the statement.
	 *
	 * @throws IOException When reading from the command line fails
	 * @throws UnsupportedException 
	 */
	public abstract void eval() throws IOException, UnsupportedException;

}