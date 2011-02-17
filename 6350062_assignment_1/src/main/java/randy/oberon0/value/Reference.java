package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;

public class Reference extends Value
{
	private final Value reference;
	
	public Reference(Value _reference)
	{
		assert(_reference != null);
		reference = _reference;
	}
	public Value dereference()
	{
		return reference.dereference();
	}
	public void setValue(Value _val) throws RuntimeException
	{
		assert(_val != null);
		reference.setValue(_val);
	}
	public Type getType()
	{
		return reference.getType();
	}
	@Override
	public String toString()
	{
		return reference.toString();
	}
	@Override
	public boolean equalsToValue(Value _value)
	{
		return reference.equalsToValue(_value);
	}
	@Override
	public Value clone()
	{
		return new Reference(reference);
	}
}
