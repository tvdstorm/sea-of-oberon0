package randy.oberon0.test;

import java.util.Iterator;
import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.interpreter.runtime.environment.IBindableValue;
import randy.oberon0.interpreter.typecheck.*;

public class TestWriteLnFunction implements IInvokableFunction
{
	private Queue<String> output;
	
	public TestWriteLnFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
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
	public void typeCheckInvoke(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws RuntimeException
	{
		// Don't accept any parameters
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
	}
	@Override
	public void typeCheckRegisterTypeDeclarations(TypeCheckEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckBody(TypeCheckEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
}
