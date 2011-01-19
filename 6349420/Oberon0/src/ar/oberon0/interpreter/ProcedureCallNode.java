package ar.oberon0.interpreter;

public class ProcedureCallNode implements Interpretable {

	private String _procedureName;
	private ActualParametersNode _parameters;
	
	public ProcedureCallNode(String procedureName, ActualParametersNode parameters)
	{
		_procedureName = procedureName;
		_parameters = parameters;
	}
	
	@Override
	public Object Interpret() throws Exception {
		return _procedureName;
	}

}
