package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

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
			newEnvironment.addVariable(variableName, newEnvironment.resolveType(typeName).instantiate(newEnvironment));
		}
	}
	public void registerAsParameter(RuntimeEnvironment environment, Queue<Value> parameterValues) throws RuntimeException // Use for registering parameters
	{
		assert(environment != null);
		assert(parameterValues != null);
		// Check if we have enough parameter values left for all our variables
		if (parameterValues.size() < variableNames.size())
			throw new IncorrectNumberOfArgumentsException();
		// Loop through all variable names
		for (String variableName : variableNames)
		{
			// Fetch a parameter value from the parameter values
			final Value parameterValue = parameterValues.poll();
			// Resolve the variable type and check if they are compatible
			if (parameterValue.getType() != environment.resolveType(typeName).instantiate(environment).getType())
				throw new TypeMismatchException(parameterValue.getType().toString(), typeName);
			// Check if the variable is a reference
			if (isReference)
			{
				// Yes, make a reference to the variable and add it to the environment
				environment.addVariable(variableName, new Reference(parameterValue));
			}
			else
			{	
				// No, create a new variable of the required type and copy the value of the variable
				Value val = environment.resolveType(typeName).instantiate(environment);
				val.setValue(parameterValue);
				// Register the variable in the environment
				environment.addVariable(variableName, val);
			}
		}
	}
}
