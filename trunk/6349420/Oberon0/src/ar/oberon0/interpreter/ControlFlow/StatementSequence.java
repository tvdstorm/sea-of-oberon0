package ar.oberon0.interpreter.ControlFlow;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Context;

/*
 * This class contains a list of statements that need to be executed sequentially.
 */
public class StatementSequence implements Interpretable
{
	/*
	 * The statements to execute.
	 */
	private List<Interpretable> _statements;

	/*
	 * Create a statement sequence, statement becomes the first statement to
	 * execute.
	 */
	public StatementSequence(Interpretable statement)
	{
		_statements = new ArrayList<Interpretable>();
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
	public Object Interpret(Context context) throws Exception
	{
		for (Interpretable statement : _statements)
		{
			statement.Interpret(context);
		}
		return 0;
	}

	/*
	 * Add a statement to the end of the statement sequence.
	 */
	public void addStatement(Interpretable statement)
	{
		_statements.add(statement);
	}

}
