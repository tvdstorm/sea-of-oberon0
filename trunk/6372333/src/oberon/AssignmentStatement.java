package oberon;

public class AssignmentStatement extends Statement {
	private String _name;
	private Expression _value;

	public AssignmentStatement(String name, Expression value)
	{
		_name = name;
		_value = value;
	}
	
	@Override
	public void Eval() {
//		etVariableManager().setVariableValue(_name, _value);
		getVariableManager().setVariableValue(_name, new IntegerExpression(_value.EvalAsInt()));
	}

}
