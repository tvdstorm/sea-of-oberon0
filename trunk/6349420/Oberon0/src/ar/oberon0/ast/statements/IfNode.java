package ar.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.BooleanValue;

/*
 * Node for a if statement. Supported is if, else, else if.
 */
public class IfNode implements Interpretable {

	private IfStatement mainIfStatements;
	private List<IfStatement> elseIfStatementsList;
	private Interpretable elseStatements;

	public void setElse(Interpretable statementsToExecute) {
		Assert.assertNotNull("The statementsToExecute parameter can't be null", statementsToExecute);
		this.elseStatements = statementsToExecute;
	}

	public IfNode(Interpretable expression, Interpretable statementsToExecute) {
		Assert.assertNotNull("The statementsToExecute parameter can't be null", statementsToExecute);
		Assert.assertNotNull("The expression parameter can't be null", expression);
		this.mainIfStatements = new IfStatement(expression, statementsToExecute);
		this.elseIfStatementsList = new ArrayList<IfStatement>();
	}

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
		}
		return 0;
	}

	public void addElseIf(Interpretable expression, Interpretable statementsToExecute) {
		Assert.assertNotNull("The statementsToExecute parameter can't be null", statementsToExecute);
		Assert.assertNotNull("The expression parameter can't be null", expression);
		this.elseIfStatementsList.add(new IfStatement(expression, statementsToExecute));
	}

	/*
	 * Internal class to capture the data for a if statement.
	 */
	private class IfStatement {

		private Interpretable ifExpression;
		private Interpretable statements;

		public IfStatement(Interpretable expression, Interpretable statements) {
			this.ifExpression = expression;
			this.statements = statements;
		}

		public boolean isExpressionTrue(Context context) throws TechnicalException {
			return ((BooleanValue) this.ifExpression.interpret(context)).equals(true);
		}

		public void execute(Context context) throws TechnicalException {
			statements.interpret(context);
		}

	}

}
