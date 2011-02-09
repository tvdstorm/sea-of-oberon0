package randy.oberon0.ast.literal;

import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
import randy.oberon0.value.Boolean;

public class BooleanLiteral extends Expression
{
	private final Boolean value;
	
	public BooleanLiteral(Boolean _value)
	{
		assert(_value != null);
		value = _value;
	}
	@Override
	public IBindableValue evaluate(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the boolean value
		return new ByValue(value);
	}
	@Override
	public ITypeCheckBindableValue typeCheck(TypeCheckEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Return the boolean value
		return new TypeCheckByValue(TypeCheckType.BOOLEAN);
	}
}
