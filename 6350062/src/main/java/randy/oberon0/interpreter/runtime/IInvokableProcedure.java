package randy.oberon0.interpreter.runtime;

import java.util.Iterator;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;

public interface IInvokableProcedure
{
	public abstract String getName();
	public abstract void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException;
	public abstract void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException;
	
	public abstract void typeCheckInvoke(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws TypeCheckException;
	public abstract void typeCheckRegisterTypeDeclarations(TypeCheckEnvironment newEnvironment) throws TypeCheckException;
	public abstract void typeCheckBody(TypeCheckEnvironment newEnvironment) throws TypeCheckException;
}
