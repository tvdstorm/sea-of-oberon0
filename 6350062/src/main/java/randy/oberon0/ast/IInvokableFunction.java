package randy.oberon0.ast;

import java.util.Iterator;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.IBindableValue;
import randy.oberon0.interpreter.typecheck.*;

public interface IInvokableFunction
{
	public abstract String getName();
	public abstract void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException;
	public abstract void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException;
	
	public abstract void typeCheckInvoke(TypeCheckEnvironment environment, Iterator<ITypeCheckType> parameterValues) throws RuntimeException;
	public abstract void typeCheckRegisterTypeDeclarations(TypeCheckEnvironment newEnvironment) throws RuntimeException;
	public abstract void typeCheckBody(TypeCheckEnvironment newEnvironment) throws RuntimeException;
}
