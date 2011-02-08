package randy.oberon0.ast;

import java.util.Iterator;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.interpreter.runtime.environment.Reference;

public interface IInvokableFunction
{
	public abstract String getName();
	public abstract void invoke(RuntimeEnvironment environment, Iterator<IValue> parameterValues) throws RuntimeException;
	public abstract void typeCheckInvoke(RuntimeEnvironment environment, Iterator<Reference> parameterValues) throws RuntimeException;
	public abstract void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException;
	public abstract void typeCheckRegisterTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException;
	public abstract void typeCheckBody(RuntimeEnvironment newEnvironment) throws RuntimeException;
}
