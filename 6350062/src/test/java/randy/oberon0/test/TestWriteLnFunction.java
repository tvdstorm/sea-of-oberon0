package randy.oberon0.test;

import java.util.Queue;
import randy.oberon0.ast.OInvokableFunction;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

public class TestWriteLnFunction implements OInvokableFunction
{
	private Queue<String> output;
	
	public TestWriteLnFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public OValue invoke(RuntimeEnvironment environment, Queue<OValue> parameterValues) throws Oberon0RuntimeException
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
	@Override
	public OValue runTypeDeclarations(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
}
