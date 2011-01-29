package randy.interpreter.buildinfunctions;

import java.util.Queue;
import randy.ast.OInvokableFunction;
import randy.exception.Oberon0IncorrectNumberOfArgumentsException;
import randy.exception.Oberon0RuntimeException;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.interpreter.runtime.TypeRegistry;
import randy.value.OValue;

public class Oberon0DefaultWriteLnFunction implements OInvokableFunction
{
	@Override
	public String getName()
	{
		return "WriteLn";
	}
	@Override
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		if (parameterValues.size() != 0)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		System.out.println("");
		return null;
	}
	@Override
	public OValue runTypeDeclarations(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
}
