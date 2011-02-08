package randy.oberon0.ast.literal;

import randy.oberon0.value.Integer;
import randy.oberon0.value.Value;
import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.*;

public class IntegerLiteral extends Expression
{
	private final Integer value;
	
	public IntegerLiteral(Integer _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public IValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the integer value
		return new ByValue(value);
	}
	@Override
	public Value typeCheck(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the integer value
		return new Integer(0);
	}
}
