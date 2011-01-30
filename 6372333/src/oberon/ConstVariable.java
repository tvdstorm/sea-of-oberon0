package oberon;

public class ConstVariable implements INamedClass, IDeepCopyable<ConstVariable>{
	private String _name;
	private Expression _value;
	
	public ConstVariable(String name, Expression value)
	{
		_name = name;
		_value = value;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public int getValue()
	{
		return _value.EvalAsInt();
	}

	@Override
	public ConstVariable DeepCopy() {
		return new ConstVariable(_name, _value);
	}
}
