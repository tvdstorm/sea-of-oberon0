package ar.oberon0.interpreter.Procedure;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.Memory.Context;

public class ProcedureCallNode implements Interpretable {

	private String _procedureName;
	private ActualParametersNode _parameters;
	
	public ProcedureCallNode(String procedureName, ActualParametersNode parameters)
	{
		_procedureName = procedureName;
		_parameters = parameters;
	}
	
	@Override
	public Object Interpret(Context context) throws Exception {
		return _procedureName;
	}

}
