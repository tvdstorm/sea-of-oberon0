package randy.value;

import randy.exception.Oberon0RuntimeException;

public class ONilValue extends OValue
{
	public ONilValue()
	{
		
	}
	@Override
	public OValue dereference()
	{
		return this;
	}
	@Override
	public void setValue(OValue _val) throws Oberon0RuntimeException
	{
		// TODO Auto-generated method stub
	}
	@Override
	public Type getType()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
