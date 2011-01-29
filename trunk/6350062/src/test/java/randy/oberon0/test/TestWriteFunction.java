package randy.oberon0.test;

import java.util.Queue;
import randy.oberon0.ast.OInvokableFunction;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.*;

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
