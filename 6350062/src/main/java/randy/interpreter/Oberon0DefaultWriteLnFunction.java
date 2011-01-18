package randy.interpreter;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.Oberon0IncorrectNumberOfArgumentsException;
import randy.exception.Oberon0RuntimeException;
import randy.value.OValue;

public class Oberon0DefaultWriteLnFunction implements OInvokableFunction
{
	@Override
	public String getName()
	{
		return "WriteLn";
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 0)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		System.out.println("");
		return null;
	}
}
