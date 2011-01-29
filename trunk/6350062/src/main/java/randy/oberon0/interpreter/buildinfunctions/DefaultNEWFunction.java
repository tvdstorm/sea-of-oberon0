package randy.oberon0.interpreter.buildinfunctions;

import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

public class DefaultNEWFunction implements IInvokableFunction
{
	@Override
	public String getName()
	{
		return "NEW";
	}
	@Override
	public Value invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		if (parameterValues.size() != 1)
			throw new IncorrectNumberOfArgumentsException();
		PointerToValue param = parameterValues.poll().castToPointerTo();
		param.invokeNew(environment);
		return null;
	}
	@Override
	public Value runTypeDeclarations(RuntimeEnvironment environment) throws RuntimeException
	{
		// Leeg
		return null;
	}
}
