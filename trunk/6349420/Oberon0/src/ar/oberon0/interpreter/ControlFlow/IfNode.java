package ar.oberon0.interpreter.ControlFlow;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * Node for a if statement. Supported is if, else, else if.
 */
public class IfNode implements Interpretable {
	/*
	 * The IfStatement object for the main if. Contains the expression to
	 * evaluate and the statements to execute if the evolution is true.
	 */
	private IfStatement mainIfStatements;
	/*
	 * The IfStatement objects for the else ifs. Contains the expressions to
	 * evaluate and the statements to execute if a evolution is true.
	 */
	private List<IfStatement> elseIfStatementsList;
	/*
	 * The action to execute if none of the ifs where true.
	 */
	private Interpretable elseStatements;

	/*
	 * Set the else statement.
	 */
	public void setElse(Interpretable statementsToExecute) {
		this.elseStatements = statementsToExecute;
	}

	/*
	 * Create a new IfNode, the expression is used to evaluate if the statements
	 * have to be executed.
	 */
	public IfNode(Interpretable expression, Interpretable statementsToExecute) {
		this.mainIfStatements = new IfStatement(expression, statementsToExecute);
		this.elseIfStatementsList = new ArrayList<IfStatement>();
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
		if (this.mainIfStatements.isExpressionTrue(context)) {
			this.mainIfStatements.execute(context);
			return 0;
		}
		for (IfStatement elseIfStatement : this.elseIfStatementsList) {
			if (elseIfStatement.isExpressionTrue(context)) {
				elseIfStatement.execute(context);
				return 0;
			}
		}
		if (this.elseStatements != null) {
			this.elseStatements.interpret(context);
			return 0;
		}
		return 0; // nothing to execute
	}

	/*
	 * Add a new else if statement.
	 */
	public void addElseIf(Interpretable expression,
			Interpretable statementsToExecute) {
		this.elseIfStatementsList.add(new IfStatement(expression,
				statementsToExecute));
	}

	/*
	 * Internal class to capture the data for a if statement.
	 */
	private class IfStatement {
		/*
		 * Expression to evaluate.
		 */
		private Interpretable ifExpression;
		/*
		 * Statements to execute if the expression is true.
		 */
		private Interpretable statements;

		/*
		 * Create a new IfStatement. expression is used to evaluate if the
		 * statements have to be executed.
		 */
		public IfStatement(Interpretable expression, Interpretable statements) {
			this.ifExpression = expression;
			this.statements = statements;
		}

		/*
		 * check if the expression evaluates to true.
		 */
		public boolean isExpressionTrue(Context context)
				throws TechnicalException {
			return (Boolean) this.ifExpression.interpret(context) == true;
		}

		/*
		 * Execute the statements of this IfStatement.
		 */
		public void execute(Context context) throws TechnicalException {
			statements.interpret(context);
		}

	}

}
