package randy.oberon0.ast.declaration;

import java.util.*;
import randy.oberon0.ast.expression.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.value.Array;
import randy.oberon0.value.Integer;
import randy.oberon0.value.Type;

public class ArrayVarDeclaration extends VarDeclaration
{
	protected final List<Expression> arrayLength;
	
	public ArrayVarDeclaration(String _typeName, boolean _isReference, List<String> _variableNames, List<Expression> _arrayLength)
	{
		super(_typeName, _isReference, _variableNames);
		assert(_arrayLength.size() >= 1);
		arrayLength = new ArrayList<Expression>(_arrayLength);
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException // Use for variable declarations IN procedures or modules
	{
		assert(newEnvironment != null);
		// Create a new instantializer for the base type
		IInstantiateableVariable arrayCreator = newEnvironment.resolveType(getTypeName());
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
		for (String name : getVariableNames())
		{
			// Create the array and add it in the environment
			newEnvironment.registerVariableByValue(name, arrayCreator.instantiate(newEnvironment));
		}
	}
	@Override
	public void registerAsParameter(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException // Use for registering parameters
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
		for (String variableName : getVariableNames())
		{
			// Check if we have a parameter left
			if (!parameterValues.hasNext())
			{
				throw new IncorrectNumberOfArgumentsException();
			}
			// Fetch a parameter value from the parameter values
			final IBindableValue parameterValue = parameterValues.next();
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
			if (isReference())
			{
				// Yes, make a reference to the variable and add it to the environment
				if (!(parameterValue instanceof Reference))
				{
					throw new ValueToReferenceConversionException();
				}
				environment.registerVariableByReference(variableName, (Reference)parameterValue);
			}
			else
			{
				// No, create a copy of the array and register it in the environment
				environment.registerVariableByValue(variableName, parameterValue.getValue().clone());
			}
		}
	}
}
