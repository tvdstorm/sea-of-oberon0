package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.ast.OInvokableFunction;
import randy.oberon0.ast.datastructures.Tuple;
import randy.oberon0.exception.Oberon0UndefinedMethodException;

public class FunctionRegistry
{
	private Map<String, Tuple<Integer, OInvokableFunction>> functions;
	private FunctionRegistry parent;
	
	public FunctionRegistry(FunctionRegistry _parent)
	{
		functions = new HashMap<String, Tuple<Integer, OInvokableFunction>>();
		parent = _parent;
	}
	public void addFunction(String name, OInvokableFunction function, int depth)
	{
		assert(functions.get(name) == null);
		functions.put(name, new Tuple<Integer, OInvokableFunction>(depth, function));
	}
	public Tuple<Integer, OInvokableFunction> resolve(String name) throws Oberon0UndefinedMethodException
	{
		if (functions.get(name) != null)
			return functions.get(name);
		else if (parent != null)
			return parent.resolve(name);
		else
			throw new Oberon0UndefinedMethodException(name);
	}
}
