package randy.oberon0.test;

import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Type;
import randy.oberon0.value.Value;

public class TestReadFunction implements IInvokableFunction
{
	private Queue<String> input;
	
	public TestReadFunction(Queue<String> _input)
	{
		input = _input;
	}
	@Override
	public Value invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		if (parameterValues.size() != 1)
			throw new IncorrectNumberOfArgumentsException();
		Value param = parameterValues.poll();
		if (!param.getType().equals(Type.INTEGER))
			throw new TypeMismatchException(param.getType(), Type.INTEGER);
		String v = input.poll();
		if (v == null)
			throw new IOErrorException("Input stack is empty...");
		param.setValue(new Integer(java.lang.Integer.parseInt(v)));
		return null;
	}
	public String getName()
	{
		return "Read";
	}
	@Override
	public Value runTypeDeclarations(RuntimeEnvironment environment) throws RuntimeException
	{
		// Leeg
		return null;
	}
}
