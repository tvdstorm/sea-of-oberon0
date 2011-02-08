package randy.oberon0.test;

import java.util.Iterator;
import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.interpreter.runtime.environment.Reference;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

public class TestWriteFunction implements IInvokableFunction
{
	private Queue<String> output;
	public TestWriteFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IValue> parameterValues) throws RuntimeException
	{
		if (!parameterValues.hasNext())
			throw new IncorrectNumberOfArgumentsException();
		Value param = parameterValues.next().getValue();
		if (!param.getType().equals(Type.INTEGER))
			throw new TypeMismatchException(param.getType().toString(), Type.INTEGER.toString());
		output.add(param.toString());
		// No parameters should be left
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
	}
	public String getName()
	{
		return "Write";
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckInvoke(RuntimeEnvironment environment, Iterator<Reference> parameterValues) throws RuntimeException
	{
		// Accept one parameter
		if (!parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Accept only an integer
		parameterValues.next().getValue().castToInteger();
		// No parameters should be left
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
