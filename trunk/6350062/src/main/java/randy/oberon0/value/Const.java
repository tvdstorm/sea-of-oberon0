package randy.oberon0.value;

import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;

public class Const extends Value
{
	private final Value value;
	
	public Const(Value _value)
	{
		value = _value;
	}
	public Value dereference()
	{
		return value.dereference();
	}
	public Type getType()
	{
		return value.getType();
	}
	@Override
	public void setValue(Value _val) throws RuntimeException
	{
		throw new ConstAssignmentException();	
	}
	@Override
	public String toString()
	{
		return value.toString();
	}
}
