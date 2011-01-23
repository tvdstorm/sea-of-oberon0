package ar.oberon0.interpreter.ControlFlow;

import ar.oberon0.interpreter.Memory.*;
import ar.oberon0.interpreter.Interpretable;

public class WhileNode implements Interpretable 
{
	private Interpretable _controlExpression;
	private Interpretable _statementsToExecute;
	
	
	public WhileNode(Interpretable controlExpression, Interpretable statementsToExecute) 
	{
		_controlExpression = controlExpression;
		_statementsToExecute = statementsToExecute;
	}

	@Override
	public Object Interpret(Context context) throws Exception {
		while((Boolean)_controlExpression.Interpret(context))
		{
			_statementsToExecute.Interpret(context);
		}
		return 0;
	}

}
