package randy.oberon0.interpreter.buildinfunctions;

import java.io.IOException;
import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Value;

public class DefaultReadFunction implements IInvokableFunction
{
	@Override
	public String getName()
	{
		return "Read";
	}
	@Override
	public Value invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		try
		{
			if (parameterValues.size() != 1)
				throw new IncorrectNumberOfArgumentsException();
			Integer param = parameterValues.poll().castToInteger();
			byte input[] = new byte[1024];
			int length = System.in.read(input);
			String in = new String(input, 0, length);
			in = in.trim();
			param.setValue(new Integer(java.lang.Integer.parseInt(in)));
			return null;
		}
		catch (IOException e)
		{
			throw new IOErrorException("Error reading from stdin...");
		}
	}
	@Override
	public void runTypeDeclarations(RuntimeEnvironment environment) throws RuntimeException
	{
		// Leeg
	}
}
