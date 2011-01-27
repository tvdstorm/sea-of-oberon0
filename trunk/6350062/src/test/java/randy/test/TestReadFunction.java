package randy.test;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.*;

public class TestReadFunction implements OInvokableFunction
{
	private Queue<String> input;
	
	public TestReadFunction(Queue<String> _input)
	{
		input = _input;
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 1)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		OValue param = parameterValues.poll();
		if (!param.getType().equals(Type.INTEGER))
			throw new Oberon0TypeMismatchException(param.getType(), Type.INTEGER);
		String v = input.poll();
		if (v == null)
			throw new Oberon0IOErrorException("Input stack is empty...");
		param.setValue(new OInteger(Integer.parseInt(v)));
		return null;
	}
	public String getName()
	{
		return "Read";
	}
}
