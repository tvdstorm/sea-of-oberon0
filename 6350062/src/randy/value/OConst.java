package randy.value;

import randy.ast.Type;
import randy.exception.Oberon0Exception;

public class OConst extends OValue
{
	private OValue value;
	
	public OConst(OValue _value)
	{
		value = _value;
	}
	public OValue getValue()
	{
		return value;
	}
	public Type getType()
	{
		return value.getType();
	}
	@Override
	public void setValue(OValue _val) throws Oberon0Exception
	{
		throw new Oberon0Exception("Can't set the value of a constant...");	
	}
	@Override
	public String toString()
	{
		return value.toString();
	}
}
