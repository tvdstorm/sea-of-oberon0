package randy.oberon0.interpreter.buildinfunctions;

import java.util.Iterator;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.interpreter.runtime.environment.Reference;
import randy.oberon0.exception.IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;

public class DefaultWriteLnFunction implements IInvokableFunction
{
	@Override
	public String getName()
	{
		return "WriteLn";
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IValue> parameterValues) throws RuntimeException
	{
		// Don't accept any parameters
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Write a new line
		System.out.println("");
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
