package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.Oberon0VariableStack;
import randy.oberon0.interpreter.runtime.TypeRegistry;
import randy.oberon0.value.OValue;

public class OProcedureDeclaration extends OBodyDeclaration implements OInvokableFunction
{
	private String name;
	private List<OVarDeclaration> parameters;
	private List<OBodyDeclaration> bodyDeclarations;
	private OBlock body;
	
	public OProcedureDeclaration(String _name, List<OVarDeclaration> _parameters, List<OBodyDeclaration> _bodyDeclarations, OBlock _body)
	{
		assert(name != null);
		assert(name.length() >= 1);
		assert(parameters != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		name = _name;
		parameters = _parameters;
		bodyDeclarations = _bodyDeclarations;
		body = _body;
	}
	@Override
	public OValue run(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		// Leeg
		return null;
	}
	@Override
	public OValue runTypeDeclarations(Oberon0VariableStack vars, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(vars != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Run all the body declarations
		for (OBodyDeclaration bd : bodyDeclarations)
		{
			if (bd instanceof ORecordDeclaration || bd instanceof OPointerToDeclaration)
				bd.run(vars, typeRegistry);
		}
		return null;
	}
	public OValue invoke(Oberon0VariableStack callerVars, Queue<OValue> parameterValues, TypeRegistry typeRegistry) throws Oberon0RuntimeException
	{
		assert(callerVars != null);
		assert(parameterValues != null);
		assert(parameters != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Create a new variable scope for the invoked function
		Oberon0VariableStack functionVars = new Oberon0VariableStack(callerVars);
		// Loop through all parameters and declare them in the invoked functions variable scope
		for (OVarDeclaration p : parameters)
		{
			p.runForParameter(functionVars, parameterValues, typeRegistry);
		}
		// If parameterValues has any values left, the number of arguments don't match
		if (parameterValues.size() > 0)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		// Loop through all body declarations
		for (OBodyDeclaration bodyDecl : bodyDeclarations)
		{
			bodyDecl.run(functionVars, typeRegistry);
		}
		// Run the body of the function
		body.run(functionVars, typeRegistry);
		return null;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		for (OVarDeclaration p : parameters)
		{
			p.accept(visitor);
		}
		for (OBodyDeclaration bodyDecl : bodyDeclarations)
		{
			bodyDecl.accept(visitor);
		}
		body.accept(visitor);
		visitor.visitAfter(this);
	}
	@Override
	public String getName()
	{
		assert(name != null);
		return name;
	}
}