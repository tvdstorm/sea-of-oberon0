package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.Value;

public class Module extends ASTNode
{
	private List<BodyDeclaration> bodyDeclarations;
	private ASTNode body;
	
	public Module(List<BodyDeclaration> _bodyDeclarations, ASTNode _body)
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
		assert(bodyDeclarations != null);
		assert(body != null);
		RuntimeEnvironment moduleEnvironment = environment.createRuntimeEnviroment(0);
		// Run all the body declarations
		for (BodyDeclaration bd : bodyDeclarations)
		{
			bd.run(moduleEnvironment);
		}
		// Run the body of the module
		return body.run(moduleEnvironment);
	}
}
