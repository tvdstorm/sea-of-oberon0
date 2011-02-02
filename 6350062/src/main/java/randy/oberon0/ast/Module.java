package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class Module extends ASTNode
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
		assert(environment != null);
		// Create a runtime environment
		RuntimeEnvironment moduleEnvironment = environment.createRuntimeEnviroment(0);
		// Register all declarations in the module's environment
		for (BodyDeclaration bd : bodyDeclarations)
		{
			bd.run(moduleEnvironment);
		}
		// Run the body of the module
		return body.run(moduleEnvironment);
	}
}
