package ar.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;

/*
 * This class contains a list of statements that need to be executed sequentially.
 */
public class StatementSequence implements Interpretable {
	/*
	 * The statements to execute.
	 */
	private List<Interpretable> statements;

	/*
	 * Create a statement sequence, statement becomes the first statement to
	 * execute.
	 */
	public StatementSequence(Interpretable statement) {
		this.statements = new ArrayList<Interpretable>();
		addStatement(statement);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public Object interpret(Context context) throws TechnicalException {
		for (Interpretable statement : this.statements) {
			statement.interpret(context);
		}
		return 0;
	}

	/*
	 * Add a statement to the end of the statement sequence.
	 */
	public void addStatement(Interpretable statement) {
		this.statements.add(statement);
	}

}
