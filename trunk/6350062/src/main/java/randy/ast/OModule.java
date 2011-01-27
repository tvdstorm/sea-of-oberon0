package randy.ast;

import java.util.*;
import randy.ast.visitor.OASTNodeVisitor;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.OValue;

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
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Run all the body declarations
		for (OBodyDeclaration bd : bodyDeclarations)
		{
			bd.run(vars);
		}
		// Run the body of the module
		return body.run(vars);
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
