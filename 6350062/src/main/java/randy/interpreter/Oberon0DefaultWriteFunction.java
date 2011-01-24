package randy.interpreter;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.Oberon0IncorrectNumberOfArgumentsException;
import randy.exception.Oberon0RuntimeException;
import randy.value.OInteger;
import randy.value.OValue;

public class Oberon0DefaultWriteFunction implements OInvokableFunction
{
	@Override
	public String getName()
	{
		return "Write";
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 1)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		OInteger param = parameterValues.poll().castToInteger();
		System.out.print(((OInteger)param).toString());
		return null;
	}
}
