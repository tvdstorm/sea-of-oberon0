package randy.test;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class TestWriteFunction implements OInvokableFunction
{
	private Queue<String> output;
	public TestWriteFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 1)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		OValue param = parameterValues.poll();
		if (!param.getType().equals(Type.INTEGER))
			throw new Oberon0TypeMismatchException(param.getType(), Type.INTEGER);
		output.add(((OInteger)param).toString());
		return null;
	}
	public String getName()
	{
		return "Write";
	}
}
