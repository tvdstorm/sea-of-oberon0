package randy.oberon0.interpreter.runtime;

import java.util.*;
import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.ast.datastructures.Tuple;
import randy.oberon0.exception.UndefinedMethodException;

public class FunctionRegistry
{
	private Map<String, Tuple<Integer, IInvokableFunction>> functions;
	private FunctionRegistry parent;
	
	public FunctionRegistry(FunctionRegistry _parent)
	{
		functions = new HashMap<String, Tuple<Integer, IInvokableFunction>>();
		parent = _parent;
	}
	public void addFunction(String name, IInvokableFunction function, int depth)
	{
		assert(functions.get(name) == null);
		functions.put(name, new Tuple<Integer, IInvokableFunction>(depth, function));
	}
	public Tuple<Integer, IInvokableFunction> resolve(String name) throws UndefinedMethodException
	{
		if (functions.get(name) != null)
			return functions.get(name);
		else if (parent != null)
			return parent.resolve(name);
		else
			throw new UndefinedMethodException(name);
	}
}
