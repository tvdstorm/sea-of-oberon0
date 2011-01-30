package ar.oberon0.interpreter.Procedure;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.ControlFlow.StatementSequence;
import ar.oberon0.interpreter.Memory.Context;

/*
 * A procedure can be invoked by an procedure call node. 
 * This class contains the logic to execute a procedure.
 * A procedure is created by a procedure declaration. 
 */
class Procedure implements Interpretable
{
	private StatementSequence _statementsToExecute;
	private Context _procedureContext;

	protected Procedure(StatementSequence statementsToExecute, Context procedureContext)
	{
		_procedureContext = procedureContext;
		_statementsToExecute = statementsToExecute;
	}

	@Override
	public Object Interpret(Context context) throws Exception
	{
		_statementsToExecute.Interpret(_procedureContext);
		return 0;
	}

}
