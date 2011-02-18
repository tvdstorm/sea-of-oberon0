package randy.oberon0.interpreter.buildinfunctions;

import java.util.Iterator;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.exception.IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Integer;

public class DefaultWriteFunction implements IInvokableFunction
{
	@Override
	public String getName()
	{
		return "Write";
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
	{
		// Accept one parameter
		if (!parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Accept only an integer
		Integer param = parameterValues.next().getValue().castToInteger();
		// Print the integer
		System.out.print(param.toString());
		// No parameters should be left
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
}
