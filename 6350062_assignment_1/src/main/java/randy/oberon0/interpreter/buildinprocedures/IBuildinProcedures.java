package randy.oberon0.interpreter.buildinprocedures;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;

public interface IBuildinProcedures
{
	public void register(RuntimeEnvironment environment) throws RuntimeException;
}
