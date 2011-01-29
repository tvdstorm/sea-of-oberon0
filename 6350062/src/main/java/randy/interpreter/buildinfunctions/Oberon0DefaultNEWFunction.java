package randy.interpreter.buildinfunctions;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.*;
import randy.interpreter.preprocess.TypeRegistry;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.*;

public class Oberon0DefaultNEWFunction implements OInvokableFunction
{
	@Override
	public String getName()
	{
		return "NEW";
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 1)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		OPointerToValue param = parameterValues.poll().castToPointerTo();
		param.invokeNew(typeRegistry);
		return null;
	}
}
