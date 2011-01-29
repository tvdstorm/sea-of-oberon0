package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;
import randy.oberon0.value.Integer;

public class ArrayVarDeclaration extends VarDeclaration
{
	protected Expression arrayLength;
	
	public ArrayVarDeclaration(String _type, boolean _bIsReference, List<String> _names, Expression _arrayLength)
	{
		super(_type, _bIsReference, _names);
		assert(_type != null);
		assert(_names != null);
		assert(_arrayLength != null);
		bIsArray = true;
		arrayLength = _arrayLength;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		// Evaluate the length of the array and convert it to an integer
		Value len = arrayLength.run(environment).dereference();
		if (len.getType() != Type.INTEGER)
			throw new SelectorException("Cannot cast the length of an array from " + len.getType() + " to " + Type.INTEGER + ".");
		Integer length = (Integer)len;
		// Add all variable instances to the variable scope
		for (String name : names)
		{
			IInstantiateableVariable arrayType = environment.resolveType(type);
			ArrayVariableInstantiation arrayCreator = new ArrayVariableInstantiation(arrayType);
			arrayCreator.setLength(length.getIntValue());
			environment.addVariable(name, arrayCreator.instantiate(environment));
		}
		return null;
	}
	@Override
	public void runForParameter(RuntimeEnvironment environment, Queue<Value> parameters) throws RuntimeException
	{
		assert(environment != null);
		assert(parameters != null);
		assert(names != null);
		assert(arrayLength != null);
		if (parameters.size() < names.size())
			throw new IncorrectNumberOfArgumentsException();
		for (String name : names)
		{
			Array param = parameters.poll().castToArray();
			if (isReference)
				environment.addVariable(name, param);
			else
			{
				Integer length = arrayLength.run(environment).castToInteger();
				if (length.getIntValue() != param.getLength())
					throw new ArrayLengthMismatch();
				IInstantiateableVariable arrayType = environment.resolveType(type);
				ArrayVariableInstantiation arrayCreator = new ArrayVariableInstantiation(arrayType);
				arrayCreator.setLength(length.getIntValue());
				Array val = (Array)arrayCreator.instantiate(environment);
				for (int i=0;i<length.getIntValue();i++)
				{
					val.getIndexValue(i).setValue(param.getIndexValue(i));
				}
			}
		}
	}
}
