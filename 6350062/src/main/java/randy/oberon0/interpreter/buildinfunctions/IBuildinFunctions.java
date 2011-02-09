package randy.oberon0.interpreter.buildinfunctions;

import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.TypeCheckEnvironment;

public interface IBuildinFunctions
{
	public void register(RuntimeEnvironment environment) throws DuplicateFunctionException;
	public void typeCheckRegister(TypeCheckEnvironment environment) throws DuplicateFunctionException;
}
