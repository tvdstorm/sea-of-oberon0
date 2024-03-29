package randy.oberon0.interpreter.runtime;

import java.util.Iterator;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public interface IInvokableProcedure
{
	public abstract String getName();
	public abstract void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException;
	public abstract void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException;
}
