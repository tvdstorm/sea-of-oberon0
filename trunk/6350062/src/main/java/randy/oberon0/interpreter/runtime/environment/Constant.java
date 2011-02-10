package randy.oberon0.interpreter.runtime.environment;

import randy.oberon0.exception.UnreachableRuntimeException;
import randy.oberon0.value.Value;

public class Constant extends Reference
{
	public Constant(Value _value)
	{
		super(_value);
	}
	@Override
	public void setValue(Value _value) throws UnreachableRuntimeException
	{
		throw new UnreachableRuntimeException();
	}
}
