package randy.oberon0.ast.literal;

import randy.oberon0.value.Integer;
import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;

public class IntegerLiteral extends Expression
{
	private final Integer value;
	
	public IntegerLiteral(Integer _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the integer value
		return new ByValue(value);
	}
	@Override
	public ITypeCheckBindableValue typeCheck(TypeCheckEnvironment environment) throws TypeCheckException
	{
		assert(environment != null);
		// Return the integer value
		return new TypeCheckByValue(TypeCheckType.INTEGER);
	}
}
