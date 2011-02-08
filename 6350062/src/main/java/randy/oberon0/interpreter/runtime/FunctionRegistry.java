package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.exception.UndefinedMethodException;
import randy.oberon0.interpreter.runtime.datastructures.ClosureAndEnvironment;
import randy.oberon0.interpreter.runtime.environment.Closure;

public class FunctionRegistry
{
	private Map<String, ClosureAndEnvironment> functions;
	private FunctionRegistry parent;
	
	public FunctionRegistry(FunctionRegistry _parent)
	{
		functions = new HashMap<String, ClosureAndEnvironment>();
		parent = _parent;
	}
	public void registerFunction(String functionName, IInvokableFunction functionPointer, RuntimeEnvironment environment) throws DuplicateFunctionException
	{
		assert(functionName != null);
		assert(functionName.length() > 0);
		assert(functionPointer != null);
		assert(environment != null);
		// Check if the function has already been registered
		if (functions.get(functionName) != null)
		{
			throw new DuplicateFunctionException(functionName);
		}
		// Register the function
		functions.put(functionName, new ClosureAndEnvironment(new Closure(functionPointer), environment));
	}
	public ClosureAndEnvironment resolveFunction(String name) throws UndefinedMethodException
	{
		// Check if the function is register in this scope
		if (functions.get(name) != null)
		{
			return functions.get(name);
		}
		// Check if we have a parent scope and check if for the function
		else if (parent != null)
		{
			return parent.resolveFunction(name);
		}
		// The function isn't registered in this scope and we don't have a parent scope, return an exception
		else
		{
			throw new UndefinedMethodException(name);
		}
	}
}
