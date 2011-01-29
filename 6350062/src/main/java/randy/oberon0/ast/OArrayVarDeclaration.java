package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.*;
import randy.oberon0.value.*;

public class OArrayVarDeclaration extends OVarDeclaration
{
	protected OExpression arrayLength;
	
	public OArrayVarDeclaration(String _type, boolean _bIsReference, List<String> _names, OExpression _arrayLength)
	{
		super(_type, _bIsReference, _names);
		assert(_type != null);
		assert(_names != null);
		assert(_arrayLength != null);
		bIsArray = true;
		arrayLength = _arrayLength;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		// Evaluate the length of the array and convert it to an integer
		OValue len = arrayLength.run(environment).dereference();
		if (len.getType() != Type.INTEGER)
			throw new Oberon0SelectorException("Cannot cast the length of an array from " + len.getType() + " to " + Type.INTEGER + ".");
		OInteger length = (OInteger)len;
		// Add all variable instances to the variable scope
		for (String name : names)
		{
			OInstantiateableVariable arrayType = environment.resolveType(type);
			OArrayVariableInstantiation arrayCreator = new OArrayVariableInstantiation(arrayType);
			arrayCreator.setLength(length.getIntValue());
			environment.addVariable(name, arrayCreator.instantiate(environment));
		}
		return null;
	}
	@Override
	public void runForParameter(RuntimeEnvironment environment, Queue<OValue> parameters) throws Oberon0RuntimeException
	{
		assert(environment != null);
		assert(parameters != null);
		assert(names != null);
		assert(arrayLength != null);
		if (parameters.size() < names.size())
			throw new Oberon0IncorrectNumberOfArgumentsException();
		for (String name : names)
		{
			OArray param = parameters.poll().castToArray();
			if (isReference)
				environment.addVariable(name, param);
			else
			{
				OInteger length = arrayLength.run(environment).castToInteger();
				if (length.getIntValue() != param.getLength())
					throw new Oberon0ArrayLengthMismatch();
				OInstantiateableVariable arrayType = environment.resolveType(type);
				OArrayVariableInstantiation arrayCreator = new OArrayVariableInstantiation(arrayType);
				arrayCreator.setLength(length.getIntValue());
				OArray val = (OArray)arrayCreator.instantiate(environment);
				for (int i=0;i<length.getIntValue();i++)
				{
					val.getIndexValue(i).setValue(param.getIndexValue(i));
				}
			}
		}
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		arrayLength.accept(visitor);
		visitor.visitAfter(this);
	}
}
