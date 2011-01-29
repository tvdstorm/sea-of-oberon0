package randy.test;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.interpreter.runtime.TypeRegistry;
import randy.value.*;

public class TestWriteLnFunction implements OInvokableFunction
{
	private Queue<String> output;
	
	public TestWriteLnFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues, TypeRegistry typeRegistry) throws Oberon0RuntimeException
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
	public OValue runTypeDeclarations(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
}
