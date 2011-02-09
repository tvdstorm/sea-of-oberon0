package randy.oberon0.ast.declaration;

import java.util.*;
import randy.oberon0.ast.expression.ValueToReferenceConversion;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.interpreter.runtime.environment.IBindableValue;
import randy.oberon0.interpreter.runtime.environment.Reference;
import randy.oberon0.interpreter.typecheck.*;

public class VarDeclaration extends BodyDeclaration
{
	protected final String typeName;
	protected final boolean isArray;
	protected final boolean isReference;
	protected final List<String> variableNames;
	
	public VarDeclaration(String _typeName, boolean _isReference, List<String> _variableNames)
	{
		this(_typeName, _isReference, _variableNames, false);
	}
	protected VarDeclaration(String _typeName, boolean _isReference, List<String> _variableNames, boolean _isArray)
	{
		assert(_typeName != null);
		assert(_variableNames != null);
		typeName = _typeName;
		isArray = _isArray;
		isReference = _isReference;
		variableNames = _variableNames;
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException // Use for variable declarations IN methods or modules
	{
		assert(newEnvironment != null);
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			assert(variableName.length() >= 1);
			// Add the variable to the environment
			newEnvironment.registerVariableByReference(variableName, new Reference(newEnvironment.resolveType(typeName).instantiate(newEnvironment)));
		}
	}
	@Override
	public void typeCheckRegister(TypeCheckEnvironment newEnvironment) throws RuntimeException // Use for variable declarations IN methods or modules
	{
		assert(newEnvironment != null);
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			assert(variableName.length() >= 1);
			// Add the variable to the environment
			newEnvironment.registerVariableByReference(variableName, new TypeCheckReference(newEnvironment.resolveType(typeName)));
		}
	}
	public void registerAsParameter(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Check if we have a parameter left
			if (!parameterValues.hasNext())
			{
				throw new IncorrectNumberOfArgumentsException();
			}
			// Fetch a parameter value from the parameter values
			final IBindableValue parameterValue = parameterValues.next();
			// Resolve the variable type and check if they are compatible
			if (parameterValue.getValue().getType() != environment.resolveType(typeName).instantiate(environment).getType())
			{
				throw new TypeMismatchException(parameterValue.getValue().getType().toString(), typeName);
			}
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				environment.registerVariableByReference(variableName, (Reference)parameterValue);
			}
			else
			{	
				// No, create a copy of the parameter and register it in the environment
				environment.registerVariableByValue(variableName, parameterValue.getValue().clone());
			}
		}
	}
	public void typeCheckRegisterAsParameter(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws RuntimeException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Check if we have a parameter left
			if (!parameterValues.hasNext())
			{
				throw new IncorrectNumberOfArgumentsException();
			}
			// Fetch a parameter value from the parameter values
			final ITypeCheckBindableValue parameterValue = parameterValues.next();
			// Resolve the variable type and check if they are compatible
			if (!parameterValue.equals(environment.resolveType(typeName)))
			{
				throw new TypeMismatchException(parameterValue.toString(), typeName);
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
				// No, create a copy of the parameter and register it in the environment
				environment.registerVariableByValue(variableName, parameterValue.getValue());
			}
		}
	}
}
