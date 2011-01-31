package oberon;

public class VarVariable implements INamedClass, IDeepCopyable<VarVariable> {
	private String _name;
	private Expression _value;
	
	public VarVariable(String name, Expression value)
	{
		_name = name;
		_value = value;
	}
	
	public int getValue()
	{
		return _value.EvalAsInt();
	}
	
	public void setValue(Expression value)
	{
		_value = value;
	}
	
	public String getName()
	{
		return _name;
	}

	@Override
	public VarVariable DeepCopy() {
		return new VarVariable(_name, _value);
	}

	public VarVariable ShallowCopy(String name) {
		return new VarVariable(name, _value);
	}
}
