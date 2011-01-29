package randy.interpreter.buildinfunctions;

import java.io.IOException;
import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.*;
import randy.interpreter.preprocess.TypeRegistry;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.*;

public class Oberon0DefaultReadFunction implements OInvokableFunction
{
	@Override
	public String getName()
	{
		return "Read";
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		try
		{
			if (parameterValues.size() != 1)
				throw new Oberon0IncorrectNumberOfArgumentsException();
			OInteger param = parameterValues.poll().castToInteger();
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
