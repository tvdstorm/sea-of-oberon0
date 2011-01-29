package randy.test;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.interpreter.runtime.TypeRegistry;
import randy.value.*;

public class TestWriteFunction implements OInvokableFunction
{
	private Queue<String> output;
	public TestWriteFunction(Queue<String> _output)
	{
		output = _output;
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues, TypeRegistry typeRegistry) throws Oberon0RuntimeException
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
	@Override
	public OValue runTypeDeclarations(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
}
