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
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(false);
		return null;
	}
	@Override
	public void runTypeDeclarations(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Register all declarations in the module's environment
		for (BodyDeclaration bd : bodyDeclarations)
		{
			bd.run(environment);
		}
	}
	public Value invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Modules don't have parameters
		if (parameterValues.size() != 0)
			throw new IncorrectNumberOfArgumentsException();
		// Run the body of the module
		return body.run(environment);
	}
	@Override
	public String getName()
	{
		return "$MODULE";
	}
}
