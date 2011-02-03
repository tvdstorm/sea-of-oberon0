package randy.oberon0.interpreter.runtime;

import randy.oberon0.ast.IInvokableFunction;
import randy.oberon0.ast.datastructures.Tuple;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.value.Value;

public class RuntimeEnvironment
{
	private final VariableStack variableStack;
	private final FunctionRegistry functionRegistry;
	private final TypeRegistry typeRegistry;
	private final RuntimeEnvironment parent;
	private final int depth;
	
	public RuntimeEnvironment(VariableStack _variableStack, FunctionRegistry _functionRegistry, TypeRegistry _typeRegistry, RuntimeEnvironment _parent)
	{
		this(_variableStack, _functionRegistry, _typeRegistry, _parent, 
				(_parent == null ?
						0 :
						_parent.depth + 1
				));
	}
	private RuntimeEnvironment(VariableStack _variableStack, FunctionRegistry _functionRegistry, TypeRegistry _typeRegistry, RuntimeEnvironment _parent, int _depth)
	{
		variableStack = _variableStack;
		functionRegistry = _functionRegistry;
		typeRegistry = _typeRegistry;
		parent = _parent;
		depth = _depth;
	}
	public RuntimeEnvironment createRuntimeEnviroment(int _depth)
	{
		// Find the highest RuntimeEnvironment with a depth that is equal to _depth
		RuntimeEnvironment parentEnvironment = this;
		while (parentEnvironment != null && parentEnvironment.depth > _depth)
		{
			parentEnvironment = parentEnvironment.parent;
		}
		assert(parentEnvironment != null);
		// Create a new environment on top of the one found
		return new RuntimeEnvironment(new VariableStack(parentEnvironment.variableStack), new FunctionRegistry(parentEnvironment.functionRegistry), new TypeRegistry(parentEnvironment.typeRegistry), parentEnvironment, _depth+1);
	}
	/**************************************************************************
	 * Variable functions                                                     *
	 **************************************************************************/
	public void registerVariable(String variableName, Value value) throws RuntimeException
	{
		variableStack.registerVariable(variableName, value);
	}
	public void registerConstant(String constantName, Value value) throws RuntimeException
	{
		variableStack.registerConstant(constantName, value);
	}
	public Value getVariableValue(String variableName) throws RuntimeException
	{
		return variableStack.getVariableValue(variableName);
	}
	/**************************************************************************
	 * Function functions                                                     *
	 **************************************************************************/
	public void registerFunction(String functionName, IInvokableFunction functionPointer) throws DuplicateFunctionException
	{
		functionRegistry.registerFunction(functionName, functionPointer, depth);
	}
	public Tuple<Integer, IInvokableFunction> resolveFunction(String functionName) throws UndefinedMethodException
	{
		return functionRegistry.resolveFunction(functionName);
	}
	/**************************************************************************
	 * Type functions                                                         *
	 **************************************************************************/
	public void registerType(String typeName, IInstantiateableVariable typeCreator) throws DuplicateTypeException
	{
		typeRegistry.registerType(typeName, typeCreator);
	}
	public IInstantiateableVariable resolveType(String typeName) throws UnknownTypeException
	{
		return typeRegistry.resolveType(typeName);
	}
}
