package ar.oberon0.interpreter.Procedure;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.ControlFlow.StatementSequence;
import ar.oberon0.interpreter.Memory.Context;

/*
 * A procedure can be invoked by an procedure call node. 
 * This class contains the logic to execute a procedure.
 * A procedure is created by a procedure declaration. 
 */
class Procedure implements Interpretable {
	private StatementSequence statementsToExecute;
	private Context procedureContext;

	protected Procedure(final StatementSequence statementsToExecute, final Context procedureContext) {
		this.procedureContext = procedureContext;
		this.statementsToExecute = statementsToExecute;
	}

	@Override
	public Object interpret(final Context context) throws TechnicalException {
		this.statementsToExecute.interpret(this.procedureContext);
		return 0;
	}

}
