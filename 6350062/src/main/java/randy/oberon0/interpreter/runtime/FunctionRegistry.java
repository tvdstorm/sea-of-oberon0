package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.ast.IInvokableFunction;
import randy.library.datastructures.Tuple;
import randy.oberon0.exception.DuplicateFunctionException;
import randy.oberon0.exception.UndefinedMethodException;

public class FunctionRegistry
{
	private Map<String, Tuple<RuntimeEnvironment, IInvokableFunction>> functions; // <functionName, <environment, functionPointer>>
	private FunctionRegistry parent;
	
	public FunctionRegistry(FunctionRegistry _parent)
	{
		functions = new HashMap<String, Tuple<RuntimeEnvironment, IInvokableFunction>>();
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
			throw new DuplicateFunctionException(functionName);
		// Register the function
		functions.put(functionName, new Tuple<RuntimeEnvironment, IInvokableFunction>(environment, functionPointer));
	}
	public Tuple<RuntimeEnvironment, IInvokableFunction> resolveFunction(String name) throws UndefinedMethodException // <environment, functionPointer>
	{
		// Check if the function is register in this scope
		if (functions.get(name) != null)
			return functions.get(name);
		// Check if we have a parent scope and check if for the function
		else if (parent != null)
			return parent.resolveFunction(name);
		// The function isn't registered in this scope and we don't have a parent scope, return an exception
		else
			throw new UndefinedMethodException(name);
	}
}
