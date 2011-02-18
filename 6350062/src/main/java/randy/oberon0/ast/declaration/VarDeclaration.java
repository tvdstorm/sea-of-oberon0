package randy.oberon0.ast.declaration;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.environment.*;
import randy.oberon0.interpreter.typecheck.environment.*;

public class VarDeclaration extends BodyDeclaration
{
	private final String typeName;
	private final boolean isReference;
	private final List<String> variableNames;
	
	public VarDeclaration(String _typeName, boolean _isReference, List<String> _variableNames)
	{
		assert(_typeName != null);
		assert(_variableNames != null);
		typeName = _typeName;
		isReference = _isReference;
		variableNames = new ArrayList<String>(_variableNames);
	}
	@Override
	public void register(RuntimeEnvironment newEnvironment) throws RuntimeException // Use for variable declarations IN procedures or modules
	{
		assert(newEnvironment != null);
		// Add all variables to the environment
		for (String variableName : variableNames)
		{
			assert(variableName.length() >= 1);
			newEnvironment.registerVariableByReference(variableName, new Reference(newEnvironment.resolveType(typeName).instantiate(newEnvironment)));
		}
	}
	public void registerAsParameter(RuntimeEnvironment environment, Iterator<IBindableValue> parameterValues) throws RuntimeException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Fetch a parameter value from the parameter values
			final IBindableValue parameterValue = parameterValues.next();
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
		// Add all variables to the environment
		for (String variableName : variableNames)
		{
			assert(variableName.length() >= 1);
			newEnvironment.registerVariableByReference(variableName, new TypeCheckReference(newEnvironment.resolveType(typeName)));
		}
	}
	public void typeCheckRegisterAsParameter(TypeCheckEnvironment environment, Iterator<ITypeCheckBindableValue> parameterValues) throws TypeCheckException // Use for registering parameters
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
					throw new ValueToReferenceConversionException();
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
	protected String getTypeName()
	{
		return typeName;
	}
	protected boolean isReference()
	{
		return isReference;
	}
	protected List<String> getVariableNames()
	{
		return variableNames;
	}
}
