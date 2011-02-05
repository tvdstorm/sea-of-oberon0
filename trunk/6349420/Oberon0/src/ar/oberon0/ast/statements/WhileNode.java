package ar.oberon0.ast.statements;

import junit.framework.Assert;
import ar.oberon0.runtime.Context;
import ar.oberon0.shared.Interpretable;
import ar.oberon0.shared.TechnicalException;
import ar.oberon0.values.BooleanValue;

/*
 * Node to control a while loop.
 */
public class WhileNode implements Interpretable {
	/*
	 * The expression that is used to decide if the while loop must stop or
	 * keeps running.
	 */
	private Interpretable controlExpression;
	private Interpretable statementsToExecute;

	/*
	 * Create a while loop. The control expression determines when the while
	 * loop has to stop. the statementToExecute parameter contains the
	 * statements that are executed every time the while loop is processed.
	 */
	public WhileNode(Interpretable controlExpression, Interpretable statementsToExecute) {
		Assert.assertNotNull("The controlExpression parameter can't be null.", controlExpression);
		Assert.assertNotNull("The statementsToExecute parameter can't be null.", statementsToExecute);
		this.controlExpression = controlExpression;
		this.statementsToExecute = statementsToExecute;
	}

	@Override
	public Object interpret(Context context) throws TechnicalException {
		while (((BooleanValue) this.controlExpression.interpret(context)).equals(true)) {
			this.statementsToExecute.interpret(context);
		}
		return 0;
	}

}
