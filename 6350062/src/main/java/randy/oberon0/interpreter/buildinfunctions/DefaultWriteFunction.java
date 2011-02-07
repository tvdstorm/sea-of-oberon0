package randy.oberon0.interpreter.buildinfunctions;

import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Value;

public class DefaultWriteFunction implements IInvokableFunction
{
	@Override
	public String getName()
	{
		return "Write";
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		// Accept one parameter
		if (parameterValues.size() != 1)
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Accept only an integer
		Integer param = parameterValues.poll().dereference().castToInteger();
		// Print the integer
		System.out.print(param.toString());
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckInvoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		// Accept one parameter
		if (parameterValues.size() != 1)
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Accept only an integer
		parameterValues.poll().dereference().castToInteger();
	}
	@Override
	public void typeCheckRegisterTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
}
