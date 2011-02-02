package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class ProcedureCall extends Statement
{
	private final String procedureName;
	private final List<Expression> parameterExpressions;
	
	public ProcedureCall(String _procedureName, List<Expression> _parameterExpressions)
	{
		assert(_procedureName != null);
		assert(_parameterExpressions != null);
		procedureName = _procedureName;
		parameterExpressions = _parameterExpressions;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate all the parameters and add them to a queue
		Queue<Value> parameters = new LinkedList<Value>();
		for (Expression parameter : parameterExpressions)
		{
			Value v = parameter.run(environment);
			parameters.add(v);
		}
		// Resolve the function name to a function
		final IInvokableFunction functionDeclaration = environment.resolveFunction(procedureName).getSecond();
		// Create a new environment for the to be invoked function
		RuntimeEnvironment invokedEnvironment = environment.createRuntimeEnviroment(environment.getDepth()+1);
		// Register all declarations of the to be invoked function to it's environment 
		functionDeclaration.runTypeDeclarations(invokedEnvironment);
		// Invoke the function
		return functionDeclaration.invoke(invokedEnvironment, parameters);
	}
}
