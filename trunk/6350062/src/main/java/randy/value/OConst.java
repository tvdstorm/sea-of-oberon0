package randy.value;

import randy.exception.*;

public class OConst extends OValue
{
	private OValue value;
	
	public OConst(OValue _value)
	{
		value = _value;
	}
	public OValue dereference()
	{
		return value.dereference();
	}
	public Type getType()
	{
		return value.getType();
	}
	@Override
	public void setValue(OValue _val) throws Oberon0RuntimeException
	{
		throw new Oberon0ConstAssignmentException();	
	}
	@Override
	public String toString()
	{
		return value.toString();
	}
}