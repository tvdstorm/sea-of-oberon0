package randy.oberon0.interpreter.buildinprocedures;

import java.util.Iterator;
import randy.oberon0.interpreter.runtime.IInvokableProcedure;
import randy.oberon0.interpreter.runtime.environment.IBindableValue;
import randy.oberon0.exception.IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.TypeCheckException;
import randy.oberon0.exception.UnreachableRuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;

public class DefaultWriteLnProcedure implements IInvokableProcedure
{
	@Override
	public String getName()
	{
		return "WriteLn";
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
	{
		// Don't accept any parameters
		if (parameterValues.hasNext())
		{
			throw new UnreachableRuntimeException();
		}
		// Write a new line
		System.out.println("");
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckInvoke(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws TypeCheckException
	{
		// Don't accept any parameters
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
	}
	@Override
	public void typeCheckRegisterTypeDeclarations(TypeCheckEnvironment newEnvironment) throws TypeCheckException
	{
		// Leeg
	}
	@Override
	public void typeCheckBody(TypeCheckEnvironment newEnvironment) throws TypeCheckException
	{
		// Leeg
	}
}
