package randy.oberon0.interpreter.buildinprocedures;

import java.io.IOException;
import java.util.Iterator;
import randy.oberon0.interpreter.runtime.IInvokableProcedure;
import randy.oberon0.interpreter.runtime.environment.IBindableValue;
import randy.oberon0.interpreter.runtime.environment.Reference;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Type;

public class DefaultReadProcedure implements IInvokableProcedure
{
	@Override
	public String getName()
	{
		return "Read";
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
	{
		try
		{
			// Accept one parameter
			if (!parameterValues.hasNext())
			{
				throw new IncorrectNumberOfArgumentsException();
			}
			// Check if the parameter is an integer
			Reference param = (Reference)parameterValues.next();
			
			if (!param.getValue().getType().equals(Type.INTEGER))
			{
				throw new TypeMismatchException(param.getValue().getType().toString(), Type.INTEGER.toString());
			}
			// Write a prompt to indicate that we need input
			System.out.println("Script requests input: ");
			// Read a line from the input
			byte input[] = new byte[1024];
			int length = System.in.read(input);
			String in = new String(input, 0, length);
			in = in.trim();
			// Parse the string to an integer and set the parameters value
			param.setValue(new Integer(java.lang.Integer.parseInt(in)));
			// No parameters should be left
			if (parameterValues.hasNext())
			{
				throw new IncorrectNumberOfArgumentsException();
			}
		}
		catch (IOException e)
		{
			throw new IOErrorException("Error reading from stdin...");
		}
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckInvoke(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws RuntimeException
	{
		// Accept one parameter
		if (!parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Accept only an integer
		parameterValues.next().mustBe(TypeCheckType.INTEGER);
		// No parameters should be left
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
	}
	@Override
	public void typeCheckRegisterTypeDeclarations(TypeCheckEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckBody(TypeCheckEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
}
