package oberon;

public class IdentifierExpression extends Expression {
	private String _name;

	public IdentifierExpression(String name)
	{
		_name = name;
	}
	
	public String getName()
	{
		return _name;
	}
	
	@Override
	public int EvalAsInt() {
		return VariableManager.getInstance().getVariableValue(_name);
	}

}
