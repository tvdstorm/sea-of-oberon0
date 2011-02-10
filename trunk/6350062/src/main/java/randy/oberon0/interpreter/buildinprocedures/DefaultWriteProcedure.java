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
import randy.oberon0.value.Integer;

public class DefaultWriteProcedure implements IInvokableProcedure
{
	@Override
	public String getName()
	{
		return "Write";
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
	{
		// Accept one parameter
		if (!parameterValues.hasNext())
		{
			throw new UnreachableRuntimeException();
		}
		// Accept only an integer
		Integer param = (Integer)parameterValues.next().getValue();
		// Print the integer
		System.out.print(param.toString());
		// No parameters should be left
		if (parameterValues.hasNext())
		{
			throw new UnreachableRuntimeException();
		}
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckInvoke(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws TypeCheckException
	{
		// Accept one parameter
		if (!parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Accept only an integer
		parameterValues.next().equals(TypeCheckType.INTEGER);
		// No parameters should be left
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
