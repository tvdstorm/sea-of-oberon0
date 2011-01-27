package randy.ast;

import java.util.Queue;
import randy.exception.Oberon0RuntimeException;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.OValue;

public interface OInvokableFunction
{
	public abstract String getName();
	public abstract OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues) throws Oberon0RuntimeException;
}
