package randy.oberon0.test;

import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

public class TestWriteLnFunction implements IInvokableFunction
{
	private Queue<String> output;
	
	public TestWriteLnFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public Value invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		if (parameterValues.size() != 0)
			throw new IncorrectNumberOfArgumentsException();
		output.add(null);
		return null;
	}
	public String getName()
	{
		return "WriteLn";
	}
	@Override
	public void runTypeDeclarations(RuntimeEnvironment environment) throws RuntimeException
	{
		// Leeg
	}
}
