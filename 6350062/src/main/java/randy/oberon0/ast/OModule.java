package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.OValue;

public class OModule extends OASTNode
{
	private List<OBodyDeclaration> bodyDeclarations;
	private OASTNode body;
	
	public OModule(List<OBodyDeclaration> _bodyDeclarations, OASTNode _body)
	{
		assert(_body != null);
		assert(_bodyDeclarations != null);
		body = _body;
		bodyDeclarations = _bodyDeclarations;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		RuntimeEnvironment moduleEnvironment = environment.createRuntimeEnviroment(0);
		// Run all the body declarations
		for (OBodyDeclaration bd : bodyDeclarations)
		{
			bd.run(moduleEnvironment);
		}
		// Run the body of the module
		return body.run(moduleEnvironment);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		body.accept(visitor);
		for (OBodyDeclaration bd : bodyDeclarations)
		{
			bd.accept(visitor);
		}
		visitor.visitAfter(this);
	}
}
