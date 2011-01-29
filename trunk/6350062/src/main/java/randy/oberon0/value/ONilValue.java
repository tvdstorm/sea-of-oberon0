package randy.oberon0.value;

import randy.oberon0.exception.Oberon0RuntimeException;

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
		// Resolve CONST
		_val.castToNil();
	}
	@Override
	public Type getType()
	{
		return Type.NIL;
	}
	@Override
	public String toString()
	{
		return Type.NIL.getTypeText();
	}
}
