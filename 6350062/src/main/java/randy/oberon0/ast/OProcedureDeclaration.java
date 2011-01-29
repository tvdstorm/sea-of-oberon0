package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
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
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		environment.addFunction(getName(), this);
		return null;
	}
	@Override
	public OValue runTypeDeclarations(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Run all the body declarations
		for (OBodyDeclaration bd : bodyDeclarations)
		{
			if (bd instanceof ORecordDeclaration || bd instanceof OPointerToDeclaration)
				bd.run(environment);
		}
		return null;
	}
	public OValue invoke(RuntimeEnvironment environment, Queue<OValue> parameterValues) throws Oberon0RuntimeException
	{
		assert(parameterValues != null);
		assert(parameters != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Loop through all parameters and declare them in the invoked functions variable scope
		for (OVarDeclaration p : parameters)
		{
			p.runForParameter(environment, parameterValues);
		}
		// If parameterValues has any values left, the number of arguments don't match
		if (parameterValues.size() > 0)
			throw new Oberon0IncorrectNumberOfArgumentsException();
		// Loop through all body declarations
		for (OBodyDeclaration bodyDecl : bodyDeclarations)
		{
			bodyDecl.run(environment);
		}
		// Run the body of the function
		body.run(environment);
		return null;
	}
	@Override
	public String getName()
	{
		assert(name != null);
		return name;
	}
}
