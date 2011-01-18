package randy.test;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.*;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class TestWriteLnFunction implements OInvokableFunction
{
	private Queue<String> output;
	
	public TestWriteLnFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 0)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		output.add(null);
		return null;
	}
	public String getName()
	{
		return "WriteLn";
	}
}
