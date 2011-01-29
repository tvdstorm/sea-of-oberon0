package randy.oberon0.interpreter.buildinfunctions;

import java.util.Queue;
import randy.oberon0.ast.OInvokableFunction;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.*;

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
	@Override
	public OValue runTypeDeclarations(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
}
