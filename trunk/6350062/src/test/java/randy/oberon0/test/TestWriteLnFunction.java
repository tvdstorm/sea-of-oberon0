package randy.oberon0.test;

import java.util.Iterator;
import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.interpreter.runtime.environment.Reference;

public class TestWriteLnFunction implements IInvokableFunction
{
	private Queue<String> output;
	
	public TestWriteLnFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IValue> parameterValues) throws RuntimeException
	{
		if (parameterValues.hasNext())
			throw new IncorrectNumberOfArgumentsException();
		output.add(null);
	}
	public String getName()
	{
		return "WriteLn";
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckInvoke(RuntimeEnvironment environment, Iterator<Reference> parameterValues) throws RuntimeException
	{
		// Don't accept any parameters
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
	}
	@Override
	public void typeCheckRegisterTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckBody(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
}
