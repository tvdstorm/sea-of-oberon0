package randy.oberon0.ast;

import randy.oberon0.value.Integer;
import randy.oberon0.value.Value;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;

public class IntegerLiteral extends Expression
{
	private final Integer value;
	
	public IntegerLiteral(Integer _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public Value evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the integer value
		return value;
	}
	@Override
	public Value typeCheck(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the integer value
		return new Integer(0);
	}
}
