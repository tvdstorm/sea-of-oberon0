package randy.oberon0.interpreter.runtime;

import randy.oberon0.ast.IInvokableFunction;
import randy.library.datastructures.Tuple;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.exception.*;
import randy.oberon0.value.Value;

public class RuntimeEnvironment
{
	private final VariableStack variableStack;
	private final FunctionRegistry functionRegistry;
	private final TypeRegistry typeRegistry;
	
	public RuntimeEnvironment(VariableStack _variableStack, FunctionRegistry _functionRegistry, TypeRegistry _typeRegistry)
	{
		assert(_variableStack != null);
		assert(_functionRegistry != null);
		assert(_typeRegistry != null);
		variableStack = _variableStack;
		functionRegistry = _functionRegistry;
		typeRegistry = _typeRegistry;
	}
	public RuntimeEnvironment(RuntimeEnvironment baseEnvironment)
	{
		// Create a new environment on top of the base environment
		this(new VariableStack(baseEnvironment.variableStack), new FunctionRegistry(baseEnvironment.functionRegistry), new TypeRegistry(baseEnvironment.typeRegistry));
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
		functionRegistry.registerFunction(functionName, functionPointer, this);
	}
	public Tuple<RuntimeEnvironment, IInvokableFunction> resolveFunction(String functionName) throws UndefinedMethodException
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
