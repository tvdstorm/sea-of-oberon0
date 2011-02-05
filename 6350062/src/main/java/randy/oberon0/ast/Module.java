package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.IncorrectNumberOfArgumentsException;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class Module extends ASTNode implements IInvokableFunction
{
	private final List<BodyDeclaration> bodyDeclarations;
	private final Statement body;
	
	public Module(List<BodyDeclaration> _bodyDeclarations, Statement _body)
	{
		assert(_body != null);
		assert(_bodyDeclarations != null);
		body = _body;
		bodyDeclarations = _bodyDeclarations;
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
	public void invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Modules don't have parameters
		if (parameterValues.size() != 0)
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
		// Run the body of the module
		body.run(environment);
	}
	@Override
	public String getName()
	{
		return "$MODULE";
	}
}
