package randy.oberon0.value;

import randy.oberon0.exception.RuntimeException;

public class NilValue extends Value
{
	public NilValue()
	{
		
	}
	@Override
	public Value dereference()
	{
		return this;
	}
	@Override
	public void setValue(Value _val) throws RuntimeException
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
