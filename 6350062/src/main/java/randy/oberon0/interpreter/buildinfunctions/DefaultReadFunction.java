package randy.oberon0.interpreter.buildinfunctions;

import java.io.IOException;
import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Type;
import randy.oberon0.value.Value;

public class DefaultReadFunction implements IInvokableFunction
{
	@Override
	public String getName()
	{
		return "Read";
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		try
		{
			// Accept one parameter
			if (parameterValues.size() != 1)
			{
				throw new IncorrectNumberOfArgumentsException();
			}
			// Check if the parameter is an integer
			Value param = parameterValues.poll();
			if (!param.getType().equals(Type.INTEGER))
			{
				throw new TypeMismatchException(param.getType().toString(), Type.INTEGER.toString());
			}
			// Read a line from the input
			byte input[] = new byte[1024];
			int length = System.in.read(input);
			String in = new String(input, 0, length);
			in = in.trim();
			// Parse the string to an integer and set the parameters value
			param.setValue(new Integer(java.lang.Integer.parseInt(in)));
		}
		catch (IOException e)
		{
			throw new IOErrorException("Error reading from stdin...");
		}
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
}
