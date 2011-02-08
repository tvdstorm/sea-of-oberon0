package randy.oberon0.ast.declaration;

import java.util.*;
import randy.oberon0.ast.expression.Expression;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.interpreter.runtime.environment.IValue;
import randy.oberon0.interpreter.runtime.environment.Reference;
import randy.oberon0.value.*;
import randy.oberon0.value.Integer;

public class ArrayVarDeclaration extends VarDeclaration
{
	protected final List<Expression> arrayLength;
	
	public ArrayVarDeclaration(String _typeName, boolean _isReference, List<String> _variableNames, List<Expression> _arrayLength)
	{
		super(_typeName, _isReference, _variableNames, true);
		assert(_arrayLength.size() >= 1);
		arrayLength = _arrayLength;
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException // Use for variable declarations IN methods or modules
	{
		assert(newEnvironment != null);
		// Create a new instantializer for the base type
		IInstantiateableVariable arrayCreator = newEnvironment.resolveType(typeName);
		// Loop through all the length expressions in reverse order
		ListIterator<Expression> iterator = arrayLength.listIterator(arrayLength.size());
		while (iterator.hasPrevious())
		{
			// Get the previous length expressoin
			Expression curExpression = iterator.previous();
			// Evaluate the length expression
			Integer thisLength = curExpression.evaluate(newEnvironment).getValue().castToInteger();
			// Create a new array instantializer for the array and set the length of the array
			ArrayVariableInstantiation thisCreator = new ArrayVariableInstantiation(arrayCreator);
			thisCreator.setLength(thisLength.getIntValue());
			// Set the array instantializer as the current instantializer
			arrayCreator = thisCreator;
		}
		
		// Loop through all variable names
		for (String name : variableNames)
		{
			// Create the array and add it in the environment
			newEnvironment.registerVariableByValue(name, arrayCreator.instantiate(newEnvironment));
		}
	}
	@Override
	public void registerAsParameter(RuntimeEnvironment environment, Iterator<IValue> parameterValues) throws RuntimeException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Loop through all the length expressions in normal order to resolve them
		List<Integer> lengths = new LinkedList<Integer>();
		for (Expression curExpression : arrayLength)
		{
			// Evaluate the length expression and add it to the stack
			lengths.add(curExpression.evaluate(environment).getValue().castToInteger());
		}
		
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Check if we have a parameter left
			if (!parameterValues.hasNext())
			{
				throw new IncorrectNumberOfArgumentsException();
			}
			// Fetch a parameter value from the parameter values
			final IValue parameterValue = parameterValues.next();
			// Check if the length of the parameter matches the definition
			Array testArray = parameterValue.getValue().castToArray();
			boolean bFirst = true;
			for (Integer length : lengths)
			{
				if (!bFirst)
				{
					// Grab the next nesting
					testArray = testArray.getIndexValue(0).getValue().castToArray();
				}
				if (testArray.getLength() != length.getIntValue())
				{
					throw new ArrayLengthMismatch();
				}
				bFirst = false;
			}
			// The test array next nesting shouldn't be an array anymore, or else the nesting doesn't match
			if (testArray.getIndexValue(0).getValue().getType() == Type.ARRAY)
			{
				throw new ArrayLengthMismatch();
			}
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				environment.registerVariableByReference(variableName, (Reference)parameterValue);
			}
			else
			{
				// No, create a copy of the array and register it in the environment
				environment.registerVariableByValue(variableName, parameterValue.getValue().clone());
			}
		}
	}
	@Override
	public void typeCheckRegister(RuntimeEnvironment newEnvironment) throws RuntimeException // Use for variable declarations IN methods or modules
	{
		assert(newEnvironment != null);
		// Create a new instantializer for the base type
		IInstantiateableVariable arrayCreator = newEnvironment.resolveType(typeName);
		// Loop through all the length expressions in reverse order
		ListIterator<Expression> iterator = arrayLength.listIterator(arrayLength.size());
		while (iterator.hasPrevious())
		{
			// Get the previous length expressoin
			Expression curExpression = iterator.previous();
			// Evaluate the length expression
			curExpression.typeCheck(newEnvironment).castToInteger();
			// Create a new array instantializer for the array and set the length of the array
			ArrayVariableInstantiation thisCreator = new ArrayVariableInstantiation(arrayCreator);
			thisCreator.setLength(1);
			// Set the array instantializer as the current instantializer
			arrayCreator = thisCreator;
		}
		
		// Loop through all variable names
		for (String name : variableNames)
		{
			// Create the array and add it in the environment
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				newEnvironment.registerVariableByReference(name, new Reference(arrayCreator.instantiate(newEnvironment)));
			}
			else
			{
				// No, create a copy of the array and register it in the environment
				newEnvironment.registerVariableByValue(name, arrayCreator.instantiate(newEnvironment));
			}
		}
	}
	@Override
	public void typeCheckRegisterAsParameter(RuntimeEnvironment environment, Iterator<Reference> parameterValues) throws RuntimeException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		
		// Loop through all the length expressions in normal order to resolve them
		Queue<Integer> lengths = new LinkedList<Integer>();
		for (Expression curExpression : arrayLength)
		{
			// Evaluate the length expression and add it to the stack
			lengths.add(curExpression.typeCheck(environment).castToInteger());
		}
		
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Check if we have a parameter left
			if (!parameterValues.hasNext())
			{
				throw new IncorrectNumberOfArgumentsException();
			}
			// Fetch a parameter value from the parameter values
			final Reference parameterValue = parameterValues.next();
			// Check if the length of the parameter matches the definition
			Array testArray = parameterValue.getValue().castToArray();
			boolean bFirst = true;
			for (@SuppressWarnings("unused") Integer length : lengths)
			{
				if (!bFirst)
				{
					// Grab the next nesting
					testArray = testArray.getIndexValue(0).getValue().castToArray();
				}
				bFirst = false;
			}
			// The test array next nesting shouldn't be an array anymore, or else the nesting doesn't match
			if (testArray.getIndexValue(0).getValue().getType() == Type.ARRAY)
			{
				throw new ArrayLengthMismatch();
			}
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				environment.registerVariableByReference(variableName, parameterValue);
			}
			else
			{
				// No, create a copy of the array and register it in the environment
				environment.registerVariableByValue(variableName, parameterValue.getValue().clone());
			}
		}
	}
}
