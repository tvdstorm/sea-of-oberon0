package randy.oberon0.interpreter.buildinfunctions;

import java.util.Queue;
import randy.oberon0.ast.OInvokableFunction;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

public class Oberon0DefaultNEWFunction implements OInvokableFunction
{
	@Override
	public String getName()
	{
		return "NEW";
	}
	@Override
	public OValue invoke(RuntimeEnvironment environment, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 1)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		OPointerToValue param = parameterValues.poll().castToPointerTo();
		param.invokeNew(environment);
		return null;
	}
	@Override
	public OValue runTypeDeclarations(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
}
