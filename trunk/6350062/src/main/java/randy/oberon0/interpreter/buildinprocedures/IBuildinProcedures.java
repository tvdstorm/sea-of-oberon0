package randy.oberon0.interpreter.buildinprocedures;

import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.TypeCheckEnvironment;

public interface IBuildinProcedures
{
	public void register(RuntimeEnvironment environment) throws RuntimeException;
	public void typeCheckRegister(TypeCheckEnvironment environment) throws TypeCheckException;
}
