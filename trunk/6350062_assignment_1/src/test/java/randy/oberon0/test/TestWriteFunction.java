package randy.oberon0.test;

import java.util.Iterator;
import java.util.Queue;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

public class TestWriteFunction implements IInvokableProcedure
{
	private Queue<String> output;
	public TestWriteFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
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
}
