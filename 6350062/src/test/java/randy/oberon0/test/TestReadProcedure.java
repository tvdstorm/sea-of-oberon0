package randy.oberon0.test;

import java.util.Iterator;
import java.util.Queue;
import randy.oberon0.interpreter.runtime.IInvokableProcedure;
import randy.oberon0.interpreter.runtime.environment.IBindableValue;
import randy.oberon0.interpreter.runtime.environment.Reference;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Type;

public class TestReadProcedure implements IInvokableProcedure
{
	private Queue<String> input;
	
	public TestReadProcedure(Queue<String> _input)
	{
		input = _input;
	}
	@Override
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
	{
		if (!parameterValues.hasNext())
			throw new IncorrectNumberOfArgumentsException();
		Reference param = (Reference)parameterValues.next();
		if (!param.getValue().getType().equals(Type.INTEGER))
			throw new TypeMismatchException(param.getValue().getType().toString(), Type.INTEGER.toString());
		String v = input.poll();
		if (v == null)
			throw new IOErrorException("Input stack is empty...");
		param.setValue(new Integer(java.lang.Integer.parseInt(v)));
		// No parameters should be left
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
	}
	public String getName()
	{
		return "Read";
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		// Leeg
	}
	@Override
	public void typeCheckInvoke(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws RuntimeException
	{
		/// Accept one parameter
		if (!parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Accept only an integer
		((TypeCheckReference)parameterValues.next()).equals(TypeCheckType.INTEGER);
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
