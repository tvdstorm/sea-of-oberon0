package ar.oberon0.interpreter.ControlFlow;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Context;

/*
 * Node for a if statement. Supported is if, else, else if.
 */
public class IfNode implements Interpretable
{
	/*
	 * The IfStatement object for the main if. Contains the expression to
	 * evaluate and the statements to execute if the evolution is true.
	 */
	private IfStatement _mainIf;
	/*
	 * The IfStatement objects for the else ifs. Contains the expressions to
	 * evaluate and the statements to execute if a evolution is true.
	 */
	private List<IfStatement> _elseIfs;
	/*
	 * The action to execute if none of the ifs where true.
	 */
	private Interpretable _else;

	/*
	 * Add a new else if statement.
	 */
	public void addElseIf(Interpretable expression, Interpretable statementsToExecute)
	{
		_elseIfs.add(new IfStatement(expression, statementsToExecute));
	}

	/*
	 * Set the else statement.
	 */
	public void setElse(Interpretable statementsToExecute)
	{
		_else = statementsToExecute;
	}

	/*
	 * Create a new IfNode, the expression is used to evaluate if the statements
	 * have to be executed.
	 */
	public IfNode(Interpretable expression, Interpretable statementsToExecute)
	{
		_mainIf = new IfStatement(expression, statementsToExecute);
		_elseIfs = new ArrayList<IfStatement>();
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
		if (_mainIf.IsExpressionTrue(context))
		{
			_mainIf.Execute(context);
			return 0;
		}
		for (IfStatement elseIfStatement : _elseIfs)
		{
			if (elseIfStatement.IsExpressionTrue(context))
			{
				elseIfStatement.Execute(context);
				return 0;
			}
		}
		if (_else != null)
		{
			_else.Interpret(context);
			return 0;
		}
		return 0; // nothing to execute
	}

	/*
	 * Internal class to capture the data for a if statement.
	 */
	private class IfStatement
	{
		/*
		 * Expression to evaluate.
		 */
		private Interpretable _ifExpression;
		/*
		 * Statements to execute if the expression is true.
		 */
		private Interpretable _statements;

		/*
		 * Create a new IfStatement. expression is used to evaluate if the
		 * statements have to be executed.
		 */
		public IfStatement(Interpretable expression, Interpretable statements)
		{
			_ifExpression = expression;
			_statements = statements;
		}

		/*
		 * check if the expression evaluates to true.
		 */
		public boolean IsExpressionTrue(Context context) throws Exception
		{
			return (Boolean) _ifExpression.Interpret(context) == true;
		}

		/*
		 * Execute the statements of this IfStatement.
		 */
		public void Execute(Context context) throws Exception
		{
			_statements.Interpret(context);
		}

	}

}
