package randy.oberon0.interpreter.buildinfunctions;

import java.io.IOException;
import java.util.Queue;
import randy.oberon0.ast.OInvokableFunction;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.*;

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
	@Override
	public OValue runTypeDeclarations(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
}
