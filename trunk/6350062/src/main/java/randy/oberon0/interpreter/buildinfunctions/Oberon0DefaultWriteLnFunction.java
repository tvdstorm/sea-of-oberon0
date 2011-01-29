package randy.oberon0.interpreter.buildinfunctions;

import java.util.Queue;
import randy.oberon0.ast.OInvokableFunction;
import randy.oberon0.exception.Oberon0IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.Oberon0RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.OValue;

public class Oberon0DefaultWriteLnFunction implements OInvokableFunction
{
	@Override
	public String getName()
	{
		return "WriteLn";
	}
	@Override
	public OValue invoke(RuntimeEnvironment environment, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 0)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		System.out.println("");
		return null;
	}
	@Override
	public OValue runTypeDeclarations(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
}
