package randy.oberon0.interpreter.buildinfunctions;

import java.util.Iterator;
import randy.oberon0.interpreter.runtime.environment.*;
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
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
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
}
