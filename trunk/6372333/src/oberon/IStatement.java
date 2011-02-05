package oberon;

import java.io.IOException;

/**
 * The Interface IStatement, interfaces all statements.
 */
public interface IStatement {

	/**
	 * Evaluates the statement.
	 *
	 * @throws IOException When reading from the command line fails
	 */
	public abstract void eval() throws IOException;

}