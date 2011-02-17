package randy.oberon0.interpreter.runtime;

import java.util.Queue;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public interface IInvokableFunction
{
	public abstract String getName();
	public abstract void invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException;
	public abstract void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException;
}
