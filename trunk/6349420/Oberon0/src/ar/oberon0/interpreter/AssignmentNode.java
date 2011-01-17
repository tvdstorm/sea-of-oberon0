package ar.oberon0.interpreter;

public class AssignmentNode implements Interpretable {

	private Object _variableName;
	private Object _value;

	@Override
	public Object Interpret() {
		return 0;
	}
	
	public AssignmentNode(Interpretable variableName, Interpretable value)
	{
		_variableName = variableName;
		_value = value;
	}


}
