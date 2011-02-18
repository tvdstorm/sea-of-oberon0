package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.datastructures.*;
import randy.oberon0.interpreter.runtime.environment.*;

public class FunctionRegistry
{
	private Map<String, ClosureAndEnvironment> functions;
	private FunctionRegistry parent;
	
	public FunctionRegistry(FunctionRegistry _parent)
	{
		functions = new HashMap<String, ClosureAndEnvironment>();
		parent = _parent;
	}
	public void registerProcedure(String procedureName, IInvokableProcedure procedurePointer, RuntimeEnvironment environment) throws DuplicateProcedureException
	{
		assert(procedureName != null);
		assert(procedureName.length() > 0);
		assert(procedurePointer != null);
		assert(environment != null);
		// Check if the procedure has already been registered
		if (functions.get(procedureName) != null)
		{
			throw new DuplicateProcedureException(procedureName);
		}
		// Register the procedure
		functions.put(procedureName, new ClosureAndEnvironment(new Closure(procedurePointer, environment), environment));
	}
	public ClosureAndEnvironment resolveFunction(String name) throws UndefinedBindableException
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
			throw new UndefinedBindableException(name);
		}
	}
}
