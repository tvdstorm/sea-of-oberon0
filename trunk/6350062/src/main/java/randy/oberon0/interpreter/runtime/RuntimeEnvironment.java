package randy.oberon0.interpreter.runtime;

import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.ast.datastructures.Tuple;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.value.Value;

public class RuntimeEnvironment
{
	private VariableStack variableStack;
	private FunctionRegistry functionRegistry;
	private TypeRegistry typeRegistry;
	private RuntimeEnvironment parent;
	private int depth;
	
	public RuntimeEnvironment(VariableStack _variableStack, FunctionRegistry _functionRegistry, TypeRegistry _typeRegistry, RuntimeEnvironment _parent)
	{
		variableStack = _variableStack;
		functionRegistry = _functionRegistry;
		typeRegistry = _typeRegistry;
		parent = _parent;
		if (parent == null)
			depth = 0;
		else
			depth = parent.getDepth() + 1;
	}
	public RuntimeEnvironment createRuntimeEnviroment(int parentDepth)
	{
		// Creates a new RuntimeEnvironment with parentDepth as highest environment depth
		RuntimeEnvironment parentEnvironment = this;
		while (parentEnvironment != null && parentEnvironment.getDepth() > parentDepth)
		{
			parentEnvironment = parentEnvironment.getParent();
		}
		assert(parentEnvironment != null);
		return new RuntimeEnvironment(new VariableStack(parentEnvironment.variableStack), new FunctionRegistry(parentEnvironment.functionRegistry), new TypeRegistry(parentEnvironment.typeRegistry), parentEnvironment);
	}
	public RuntimeEnvironment getParent()
	{
		return parent;
	}
	public int getDepth()
	{
		return depth;
	}
	// Variable functions
	public void addVariable(String name, Value var) throws RuntimeException
	{
		variableStack.addVariable(name, var);
	}
	public void addConstant(String name, Value value) throws RuntimeException
	{
		variableStack.addConstant(name, value);
	}
	public Value getVariable(String name) throws RuntimeException
	{
		return variableStack.getVariable(name);
	}
	// Function functions
	public void addFunction(String name, IInvokableFunction function)
	{
		functionRegistry.addFunction(name, function, depth);
	}
	public Tuple<Integer, IInvokableFunction> resolveFunction(String name) throws UndefinedMethodException
	{
		return functionRegistry.resolve(name);
	}
	// Type functions
	public void addType(String name, IInstantiateableVariable creator)
	{
		typeRegistry.addType(name, creator);
	}
	public IInstantiateableVariable resolveType(String name) throws UnknownTypeException
	{
		return typeRegistry.resolve(name);
	}
}
