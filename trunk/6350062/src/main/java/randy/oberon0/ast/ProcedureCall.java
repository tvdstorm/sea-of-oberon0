package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class ProcedureCall extends Expression
{
	private String name;
	private List<Expression> parameters;
	
	public ProcedureCall(String _name, List<Expression> _parameters)
	{
		assert(_name != null);
		assert(_parameters != null);
		name = _name;
		parameters = _parameters;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		assert(parameters != null);
		// Evaluate all the parameters
		Queue<Value> params = new LinkedList<Value>();
		for (Expression p : parameters)
		{
			Value v = p.run(environment);
			params.add(v);
		}
		RuntimeEnvironment invokedEnvironment = environment.createRuntimeEnviroment(environment.getDepth()+1);
		IInvokableFunction functionDeclaration = environment.resolveFunction(name).getSecond();
		functionDeclaration.runTypeDeclarations(invokedEnvironment);
		// Invoke the function
		return functionDeclaration.invoke(invokedEnvironment, params);
	}
}
