package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;
import randy.oberon0.value.Integer;

public class ArrayVarDeclaration extends VarDeclaration
{
	protected final Expression arrayLength;
	
	public ArrayVarDeclaration(String _typeName, boolean _isReference, List<String> _variableNames, Expression _arrayLength)
	{
		super(_typeName, _isReference, _variableNames, true);
		arrayLength = _arrayLength;
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException // Use for variable declarations IN methods or modules
	{
		assert(newEnvironment != null);
		// Evaluate the length of the array and convert it to an integer
		final Integer length = arrayLength.evaluate(newEnvironment).dereference().castToInteger();
		// Loop through all variable names
		for (String name : variableNames)
		{
			// Resolve the type of the array members
			final IInstantiateableVariable arrayType = newEnvironment.resolveType(typeName);
			// Make an instantializer for the array
			ArrayVariableInstantiation arrayCreator = new ArrayVariableInstantiation(arrayType);
			arrayCreator.setLength(length.getIntValue());
			// Create the array and add it in the environment
			newEnvironment.addVariable(name, arrayCreator.instantiate(newEnvironment));
		}
	}
	@Override
	public void registerAsParameter(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Check if we have enough parameter values left for all our variables
		if (parameterValues.size() < variableNames.size())
			throw new IncorrectNumberOfArgumentsException();
		// Evaluate the length of the array and convert it to an integer
		final int length = arrayLength.evaluate(environment).dereference().castToInteger().getIntValue();
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Fetch a parameter value from the parameter values
			final Array parameterValue = parameterValues.poll().dereference().castToArray();
			// Check if the array length of the parameter matches the definition
			if (length != parameterValue.getLength())
				throw new ArrayLengthMismatch();
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				environment.addVariable(variableName, new Reference(parameterValue));
			}
			else
			{
				// No, create a new array of the required type and length
				final IInstantiateableVariable arrayType = environment.resolveType(typeName);
				ArrayVariableInstantiation arrayCreator = new ArrayVariableInstantiation(arrayType);
				arrayCreator.setLength(length);
				Array val = (Array)arrayCreator.instantiate(environment);
				// Copy the array
				val.setValue(parameterValue);
				// Register the variable in the environment
				environment.addVariable(variableName, val);
			}
		}
	}
}
