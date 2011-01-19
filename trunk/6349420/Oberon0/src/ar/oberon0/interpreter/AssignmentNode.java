package ar.oberon0.interpreter;

public class AssignmentNode implements Interpretable {

	private Selector _variable;
	private Interpretable _value;

	@Override
	public Object Interpret() throws Exception {
		_variable.Interpret();
		_value.Interpret();
		return "Ok";
	}
	
	public AssignmentNode(Selector variable, Interpretable value)
	{
		_variable = variable;
		_value = value;
	}


}
