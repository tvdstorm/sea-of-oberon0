package ar.oberon0.interpreter.ControlFlow;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * Node to control a while loop.
 */
public class WhileNode implements Interpretable {
	/*
	 * The expression that is used to decide if the while loop must stop or
	 * keeps running.
	 */
	private Interpretable controlExpression;
	/*
	 * The statements that are executed every time the while loop is processed.
	 */
	private Interpretable statementsToExecute;

	/*
	 * Create a while loop. The control expression determines when the while
	 * loop has to stop. the statementToExecute parameter contains the
	 * statements that are executed every time the while loop is processed.
	 */
	public WhileNode(Interpretable controlExpression, Interpretable statementsToExecute) {
		this.controlExpression = controlExpression;
		this.statementsToExecute = statementsToExecute;
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
		while ((Boolean) this.controlExpression.interpret(context)) {
			this.statementsToExecute.interpret(context);
		}
		return 0;
	}

}
