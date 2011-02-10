package randy.oberon0.interpreter.buildinprocedures;

import randy.oberon0.exception.DuplicateProcedureException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.TypeCheckEnvironment;

public interface IBuildinProcedures
{
	public void register(RuntimeEnvironment environment) throws DuplicateProcedureException;
	public void typeCheckRegister(TypeCheckEnvironment environment) throws DuplicateProcedureException;
}
