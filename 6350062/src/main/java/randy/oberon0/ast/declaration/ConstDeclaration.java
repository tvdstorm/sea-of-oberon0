package randy.oberon0.ast.declaration;

import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.TypeCheckEnvironment;

public class ConstDeclaration extends BodyDeclaration
{
	private final String constantName;
	private final Expression value;
	
	public ConstDeclaration(String _constantName, Expression _value)
	{
		assert(_constantName != null);
		assert(_constantName.length() >= 1);
		assert(_value != null);
		constantName = _constantName;
		value = _value;
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		newEnvironment.registerConstant(constantName, value.evaluate(newEnvironment).getValue());
	}
	@Override
	public void typeCheckRegister(TypeCheckEnvironment newEnvironment) throws TypeCheckException
	{
		assert(newEnvironment != null);
		newEnvironment.registerConstant(constantName);
	}
}
