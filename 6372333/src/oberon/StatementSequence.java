package oberon;

import java.io.IOException;
import java.util.List;

import oberon.exceptions.UnsupportedException;

/**
 * The Class StatementSequence, represents a sequence of statements.
 */
public class StatementSequence{
	
	/** The body. */
	private final List<IStatement> body;

	/**
	 * Instantiates a new statement sequence.
	 *
	 * @param statementList the statement list
	 */
	public StatementSequence(final List<IStatement> statementList) {
		body = statementList;
	}

	/**
	 * Evaluates the sequence of statements.
	 *
	 * @throws IOException When reading from the command line fails
	 * @throws UnsupportedException 
	 */
	public void eval() throws IOException, UnsupportedException {
		if (body != null) {
			for(IStatement statement : body) {
				statement.eval();
			}
		}
	}
}
