package randy.oberon0.interpreter.buildinfunctions;

import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Value;

public class DefaultWriteLnFunction implements IInvokableFunction
{
	@Override
	public String getName()
	{
		return "WriteLn";
	}
	@Override
	public Value invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		if (parameterValues.size() != 0)
			throw new IncorrectNumberOfArgumentsException();
		System.out.println("");
		return null;
	}
	@Override
	public void runTypeDeclarations(RuntimeEnvironment environment) throws RuntimeException
	{
		// Leeg
	}
}
