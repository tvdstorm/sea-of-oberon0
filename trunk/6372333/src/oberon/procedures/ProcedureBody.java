package oberon.procedures;

import java.io.IOException;

import oberon.StatementSequence;
import oberon.VariableManager;
import oberon.exceptions.UnsupportedException;

/**
 * The Class ProcedureBody, contains the body of a procedure.
 */
public class ProcedureBody {
	
	/** The body. */
	private final StatementSequence body;
	
	/** The variable declaration. */
	private final Declaration variableDeclaration;

	/**
	 * Instantiates a new procedure body.
	 *
	 * @param declaration the declaration for the procedure 
	 * @param statements the statements in the procedure
	 */
	public ProcedureBody(final Declaration declaration, final StatementSequence statements) {
		variableDeclaration = declaration;
		body = statements;
	}
	
	/**
	 * Evaluates the body of the procedure.
	 *
	 * @throws IOException throws when an exception occurs when reading from the console
	 * @throws UnsupportedException 
	 */
	public void eval() throws IOException, UnsupportedException {
		final VariableManager variableManager = VariableManager.getInstance();
		variableManager.addNewDeclaration(variableDeclaration);
		
		body.eval();
	}
}
