package randy.interpreter;

import java.io.IOException;
import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.*;
import randy.value.*;

public class Oberon0DefaultReadFunction implements OInvokableFunction
{
	@Override
	public String getName()
	{
		return "Read";
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		try
		{
			if (parameterValues.size() != 1)
				throw new Oberon0IncorrectNumberOfArgumentsException();
			OValue param = parameterValues.poll();
			if (!param.getType().equals(Type.INTEGER))
				throw new Oberon0TypeMismatchException(param.getType(), Type.INTEGER);
			byte input[] = new byte[1024];
			int length = System.in.read(input);
			String in = new String(input, 0, length);
			in = in.trim();
			param.setValue(new OInteger(Integer.parseInt(in)));
			return null;
		}
		catch (IOException e)
		{
			throw new Oberon0IOErrorException("Error reading from stdin...");
		}
	}
}
