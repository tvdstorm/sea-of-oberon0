package oberon;

public class ArrayIndexerExpression extends Expression {
	private Expression _index;
	private String _name;

	public ArrayIndexerExpression(String name, Expression _expression)
	{
		_name = name;
		_index = _expression;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public Expression getIndex()
	{
		return _index;
	}
	
	public void setValue(int value)
	{
		VariableManager.getInstance().setArrayValue(_name, _index.EvalAsInt(), value);
	}
	
	@Override
	public int EvalAsInt() {
		return VariableManager.getInstance().getArrayValue(_name, _index.EvalAsInt());
	}

}
