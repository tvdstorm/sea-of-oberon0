package randy.oberon0.ast.declaration;

import java.util.*;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.ast.statement.Block;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.*;

public class ProcedureDeclaration extends BodyDeclaration implements IInvokableFunction
{
	private final String procedureName;
	private final List<VarDeclaration> parameterDeclarations;
	private final List<BodyDeclaration> bodyDeclarations;
	private final Block body;
	
	public ProcedureDeclaration(String _procedureName, List<VarDeclaration> _parameterDeclarations, List<BodyDeclaration> _bodyDeclarations, Block _body)
	{
		assert(_procedureName != null);
		assert(_procedureName.length() >= 1);
		assert(_parameterDeclarations != null);
		assert(_bodyDeclarations != null);
		assert(_body != null);
		procedureName = _procedureName;
		parameterDeclarations = _parameterDeclarations;
		bodyDeclarations = _bodyDeclarations;
		body = _body;
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		// Register the function in the environment
		newEnvironment.registerFunction(getName(), this);
	}
	@Override
	public void typeCheckRegister(TypeCheckEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		// Register the function in the environment
		newEnvironment.registerFunction(getName(), this);
	}
	@Override
	public void registerTypeDeclarations(RuntimeEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		// Register all the type declarations in the environment
		for (BodyDeclaration bodyDecl : bodyDeclarations)
		{
			if (bodyDecl instanceof AbstractTypeDeclaration)
			{
				bodyDecl.register(newEnvironment);
			}
		}
	}
	public void invoke(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Loop through all parameters and declare them in the invoked functions environment
		for (VarDeclaration p : parameterDeclarations)
		{
			p.registerAsParameter(environment, parameterValues);
		}
		// If parameterValues has any values left, the number of arguments don't match
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Loop through all body declarations except type declarations
		for (BodyDeclaration bodyDecl : bodyDeclarations)
		{
			if (!(bodyDecl instanceof AbstractTypeDeclaration))
			{
				bodyDecl.register(environment);
			}
		}
		// Run the body of the function
		body.run(environment);
	}
	@Override
	public String getName()
	{
		return procedureName;
	}
	@Override
	public void typeCheckInvoke(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws RuntimeException
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Loop through all parameters and declare them in the invoked functions environment
		for (VarDeclaration p : parameterDeclarations)
		{
			p.typeCheckRegisterAsParameter(environment, parameterValues);
		}
		// If parameterValues has any values left, the number of arguments don't match
		if (parameterValues.hasNext())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		// Loop through all body declarations except type declarations
		for (BodyDeclaration bodyDecl : bodyDeclarations)
		{
			if (!(bodyDecl instanceof AbstractTypeDeclaration))
			{
				bodyDecl.typeCheckRegister(environment);
			}
		}
	}
	@Override
	public void typeCheckRegisterTypeDeclarations(TypeCheckEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		// Register all the type declarations in the environment
		for (BodyDeclaration bodyDecl : bodyDeclarations)
		{
			if (bodyDecl instanceof AbstractTypeDeclaration)
			{
				bodyDecl.typeCheckRegister(newEnvironment);
			}
		}
	}
	@Override
	public void typeCheckBody(TypeCheckEnvironment newEnvironment) throws RuntimeException
	{
		assert(newEnvironment != null);
		// Loop through all parameters and declare them in the invoked functions environment
		for (VarDeclaration p : parameterDeclarations)
		{
			p.typeCheckRegister(newEnvironment);
		}
		// Register all the type declarations in the environment
		for (BodyDeclaration bodyDecl : bodyDeclarations)
		{
			if (bodyDecl instanceof AbstractTypeDeclaration)
			{
				bodyDecl.typeCheckRegister(newEnvironment);
			}
		}
		// Loop through all body declarations except type declarations
		for (BodyDeclaration bodyDecl : bodyDeclarations)
		{
			if (!(bodyDecl instanceof AbstractTypeDeclaration))
			{
				bodyDecl.typeCheckRegister(newEnvironment);
			}
		}
		// Run the body of the function
		body.typeCheck(newEnvironment);
		// Loop through all ProcedureDeclarations and typeCheck their bodies
		for (BodyDeclaration bodyDecl : bodyDeclarations)
		{
			if (bodyDecl instanceof ProcedureDeclaration)
			{
				TypeCheckEnvironment functionEnvironment = new TypeCheckEnvironment(newEnvironment);
				((ProcedureDeclaration)bodyDecl).typeCheckBody(functionEnvironment);
			}
		}
	}
}
