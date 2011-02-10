package randy.oberon0.ast.declaration;

import java.util.*;
import randy.oberon0.ast.expression.Expression;
import randy.oberon0.ast.expression.ValueToReferenceConversion;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
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
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException // Use for variable declarations IN procedures or modules
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
			Integer thisLength = (Integer)curExpression.evaluate(newEnvironment).getValue();
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
			newEnvironment.registerVariableByReference(name, new Reference(arrayCreator.instantiate(newEnvironment)));
		}
	}
	@Override
	public void typeCheckRegister(TypeCheckEnvironment newEnvironment) throws TypeCheckException // Use for variable declarations IN procedures or modules
	{
		assert(newEnvironment != null);
		// Create a new instantializer for the base type
		ITypeCheckType type = newEnvironment.resolveType(typeName);
		// Loop through all the length expressions in reverse order
		ListIterator<Expression> iterator = arrayLength.listIterator(arrayLength.size());
		while (iterator.hasPrevious())
		{
			// Get the previous length expressoin
			Expression curExpression = iterator.previous();
			// Evaluate the length expression
			curExpression.typeCheck(newEnvironment).mustBe(TypeCheckType.INTEGER);
			// Create a new array instantializer for the array
			ITypeCheckType thisType = new TypeCheckArrayType(type);
			// Set the array instantializer as the current instantializer
			type = thisType;
		}
		
		// Loop through all variable names
		for (String name : variableNames)
		{
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				newEnvironment.registerVariableByReference(name, new TypeCheckReference(type));
			}
			else
			{
				// No, create a copy of the array and register it in the environment
				newEnvironment.registerVariableByReference(name, new TypeCheckReference(type));
			}
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
			lengths.add((Integer)curExpression.evaluate(environment).getValue());
		}
		
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Check if we have a parameter left
			if (!parameterValues.hasNext())
			{
				throw new UnreachableRuntimeException();
			}
			// Fetch a parameter value from the parameter values
			final IBindableValue parameterValue = parameterValues.next();
			// Check if the length of the parameter matches the definition
			Array testArray = (Array)parameterValue.getValue();
			boolean bFirst = true;
			for (Integer length : lengths)
			{
				if (!bFirst)
				{
					// Grab the next nesting
					testArray = (Array)testArray.getIndexValue(0).getValue();
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
	public void typeCheckRegisterAsParameter(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws TypeCheckException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Loop through all the length expressions in normal order to resolve them
		List<ITypeCheckType> lengths = new LinkedList<ITypeCheckType>();
		for (Expression curExpression : arrayLength)
		{
			// Evaluate the length expression and add it to the stack
			ITypeCheckType length = curExpression.typeCheck(environment).getValue();
			length.mustBe(TypeCheckType.INTEGER);
			lengths.add(length);
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
			ITypeCheckBindableValue parameterValue = parameterValues.next();
			// Check if the parameter is an array
			if (!(parameterValue.getValue() instanceof TypeCheckArrayType))
			{
				throw new TypeMismatchException(parameterValue.toString(), "ARRAY");
			}
			boolean bFirst = true;
			for (int i=0;i<lengths.size();i++)
			{
				if (!bFirst)
				{
					// Grab the next nesting
					parameterValue = new TypeCheckReference(((TypeCheckArrayType)parameterValue.getValue()).getInnerType());
					// Check if the next nesting is an array
					if (!(parameterValue.getValue() instanceof TypeCheckArrayType))
					{
						throw new TypeMismatchException(parameterValue.toString(), "ARRAY");
					}
				}
				bFirst = false;
			}
			// The test array next nesting shouldn't be an array anymore, or else the nesting doesn't match
			if (((TypeCheckArrayType)parameterValue.getValue()).getInnerType() instanceof TypeCheckArrayType)
			{
				throw new TypeMismatchException(((TypeCheckArrayType)parameterValue).getInnerType().toString(), "NOT AN ARRAY");
			}
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				if (!(parameterValue instanceof TypeCheckReference))
				{
					throw new ValueToReferenceConversion();
				}
				environment.registerVariableByReference(variableName, (TypeCheckReference)parameterValue);
			}
			else
			{
				// No, create a copy of the array and register it in the environment
				environment.registerVariableByValue(variableName, parameterValue.getValue());
			}
		}
	}
}
