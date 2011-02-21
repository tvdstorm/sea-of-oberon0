package ar.oberon0.ast.statements;

import java.util.ArrayList;
import java.util.List;

import ar.oberon0.runtime.Context;
import ar.oberon0.shared.CheckViolation;
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
	public WhileNode(final Interpretable controlExpression, final Interpretable statementsToExecute) {
		assert controlExpression != null : "The controlExpression parameter can't be null.";
		assert statementsToExecute != null : "The statementsToExecute parameter can't be null.";
		this.controlExpression = controlExpression;
		this.statementsToExecute = statementsToExecute;
	}

	@Override
	public Object interpret(final Context context) throws TechnicalException {
		while (((BooleanValue) this.controlExpression.interpret(context)).equals(true)) {
			this.statementsToExecute.interpret(context);
		}
		return 0;
	}

	@Override
	public List<CheckViolation> check(final Context context) {
		return new ArrayList<CheckViolation>();
	}
}
