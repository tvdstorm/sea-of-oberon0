package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.Value;

public class ProcedureDeclaration extends BodyDeclaration implements IInvokableFunction
{
	private String name;
	private List<VarDeclaration> parameters;
	private List<BodyDeclaration> bodyDeclarations;
	private Block body;
	
	public ProcedureDeclaration(String _name, List<VarDeclaration> _parameters, List<BodyDeclaration> _bodyDeclarations, Block _body)
	{
		assert(_name != null);
		assert(_name.length() >= 1);
		assert(_parameters != null);
		assert(_bodyDeclarations != null);
		assert(_body != null);
		name = _name;
		parameters = _parameters;
		bodyDeclarations = _bodyDeclarations;
		body = _body;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		environment.addFunction(getName(), this);
		return null;
	}
	@Override
	public Value runTypeDeclarations(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Run all the body declarations
		for (BodyDeclaration bd : bodyDeclarations)
		{
			if (bd instanceof RecordDeclaration || bd instanceof PointerToDeclaration)
				bd.run(environment);
		}
		return null;
	}
	public Value invoke(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException
	{
		assert(parameterValues != null);
		assert(parameters != null);
		assert(bodyDeclarations != null);
		assert(body != null);
		// Loop through all parameters and declare them in the invoked functions variable scope
		for (VarDeclaration p : parameters)
		{
			p.runForParameter(environment, parameterValues);
		}
		// If parameterValues has any values left, the number of arguments don't match
		if (parameterValues.size() > 0)
			throw new IncorrectNumberOfArgumentsException();
		// Loop through all body declarations
		for (BodyDeclaration bodyDecl : bodyDeclarations)
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
