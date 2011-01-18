package randy.interpreter;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.Oberon0IncorrectNumberOfArgumentsException;
import randy.exception.Oberon0RuntimeException;
import randy.exception.Oberon0TypeMismatchException;
import randy.value.OInteger;
import randy.value.OValue;
import randy.value.Type;

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
		OValue param = parameterValues.poll();
		if (!param.getType().equals(Type.INTEGER))
			throw new Oberon0TypeMismatchException(param.getType(), Type.INTEGER);
		System.out.print(((OInteger)param).toString());
		return null;
	}
}
