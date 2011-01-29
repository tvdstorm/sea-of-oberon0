package ar.oberon0.interpreter.Procedure;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.ControlFlow.StatementSequence;
import ar.oberon0.interpreter.Memory.Context;

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
