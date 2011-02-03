package randy.oberon0.interpreter.buildinfunctions;

import java.util.Queue;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Value;

public class DefaultWriteFunction implements IInvokableFunction
{
	@Override
	public String getName()
	{
		return "Write";
	}
	@Override
	public Value invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		if (parameterValues.size() != 1)
			throw new IncorrectNumberOfArgumentsException();
		Integer param = parameterValues.poll().castToInteger();
		System.out.print(((Integer)param).toString());
		return null;
	}
	@Override
	public void runTypeDeclarations(RuntimeEnvironment environment) throws RuntimeException
	{
		// Leeg
	}
}
