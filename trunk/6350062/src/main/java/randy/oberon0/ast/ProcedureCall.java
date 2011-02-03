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
	public void run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate all the parameters and add them to a queue
		Queue<Value> parameters = new LinkedList<Value>();
		for (Expression parameter : parameterExpressions)
		{
			Value v = parameter.evaluate(environment);
			parameters.add(v);
		}
		// Resolve the function name to a function
		final IInvokableFunction functionDeclaration = environment.resolveFunction(procedureName).getSecond();
		final int functionDepth = environment.resolveFunction(procedureName).getFirst();
		// Create a new environment for the to be invoked function
		RuntimeEnvironment invokedEnvironment = environment.createRuntimeEnviroment(functionDepth);
		// Register all declarations of the to be invoked function to it's environment 
		functionDeclaration.registerTypeDeclarations(invokedEnvironment);
		// Invoke the function
		functionDeclaration.invoke(invokedEnvironment, parameters);
	}
}
