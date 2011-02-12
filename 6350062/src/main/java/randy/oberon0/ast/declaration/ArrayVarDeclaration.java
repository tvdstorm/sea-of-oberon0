package randy.oberon0.ast.declaration;

import java.util.*;
import randy.oberon0.ast.expression.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;
import randy.oberon0.value.Array;
import randy.oberon0.value.Integer;

public class ArrayVarDeclaration extends VarDeclaration
{
	protected final List<Expression> arrayLength;
	
	public ArrayVarDeclaration(String _typeName, boolean _isReference, List<String> _variableNames, List<Expression> _arrayLength)
	{
		super(_typeName, _isReference, _variableNames, true);
		assert(_arrayLength.size() >= 1);
		arrayLength = new ArrayList<Expression>(_arrayLength);
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
			// Get the previous length expression and evaluate it
			Expression curExpression = iterator.previous();
			Integer thisLength = (Integer)curExpression.evaluate(newEnvironment).getValue();
			// Create a new array instantializer for the array and set the length of the array
			arrayCreator = new ArrayVariableInstantiation(arrayCreator);
			((ArrayVariableInstantiation)arrayCreator).setLength(thisLength.getIntValue());
		}
		// Loop through all variable names, instantiate a new array and add it to the environment
		for (String name : variableNames)
		{
			newEnvironment.registerVariableByReference(name, new Reference(arrayCreator.instantiate(newEnvironment)));
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
			// Fetch a parameter value from the parameter values
			final IBindableValue parameterValue = parameterValues.next();
			// Check if the length of the array(s) matches the definition
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
			if (isReference)
			{
				environment.registerVariableByReference(variableName, (Reference)parameterValue);
			}
			else
			{
				environment.registerVariableByValue(variableName, parameterValue.getValue().clone());
			}
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
			// Get the previous length expression and evaluate it
			Expression curExpression = iterator.previous();
			curExpression.typeCheck(newEnvironment).mustBe(TypeCheckType.INTEGER);
			// Create a new array instantializer for the array
			type = new TypeCheckArrayType(type);
		}
		// Loop through all variable names
		for (String name : variableNames)
		{
			if (isReference)
			{
				newEnvironment.registerVariableByReference(name, new TypeCheckReference(type));
			}
			else
			{
				newEnvironment.registerVariableByReference(name, new TypeCheckReference(type));
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
					throw new ValueToReferenceConversionException();
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
