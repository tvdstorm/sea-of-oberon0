package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
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
			Integer thisLength = curExpression.evaluate(newEnvironment).dereference().castToInteger();
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
			newEnvironment.registerVariable(name, arrayCreator.instantiate(newEnvironment));
		}
	}
	@Override
	public void registerAsParameter(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Check if we have enough parameter values left for all our variables
		if (parameterValues.size() < variableNames.size())
		{
			throw new IncorrectNumberOfArgumentsException();
		}
		
		// Loop through all the length expressions in normal order to resolve them
		Queue<Integer> lengths = new LinkedList<Integer>();
		for (Expression curExpression : arrayLength)
		{
			// Evaluate the length expression and add it to the stack
			lengths.add(curExpression.evaluate(environment).dereference().castToInteger());
		}
		
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Fetch a parameter value from the parameter values
			final Array parameterValue = parameterValues.poll().dereference().castToArray();
			// Check if the length of the parameter matches the definition
			Array testArray = parameterValue;
			boolean bFirst = true;
			for (Integer length : lengths)
			{
				if (!bFirst)
				{
					// Grab the next nesting
					testArray = testArray.getIndexValue(0).castToArray();
				}
				if (testArray.getLength() != length.getIntValue())
				{
					throw new ArrayLengthMismatch();
				}
				bFirst = false;
			}
			// The test array next nesting shouldn't be an array anymore, or else the nesting doesn't match
			if (testArray.getIndexValue(0).getType() == Type.ARRAY)
			{
				throw new ArrayLengthMismatch();
			}
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				environment.registerVariable(variableName, new Reference(parameterValue));
			}
			else
			{
				// No, create a copy of the array and register it in the environment
				environment.registerVariable(variableName, parameterValue.clone());
			}
		}
	}
}
