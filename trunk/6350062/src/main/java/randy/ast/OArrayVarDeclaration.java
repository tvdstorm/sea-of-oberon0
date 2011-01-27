package randy.ast;

import java.util.*;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.*;

public class OArrayVarDeclaration extends OVarDeclaration
{
	protected OExpression arrayLength;
	
	public OArrayVarDeclaration(Type _type, boolean _bIsReference, List<String> _names, OExpression _arrayLength)
	{
		super(_type, _bIsReference, _names);
		assert(_type != null);
		assert(_names != null);
		assert(_arrayLength != null);
		bIsArray = true;
		arrayLength = _arrayLength;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		// Evaluate the length of the array and convert it to an integer
		OValue len = arrayLength.run(vars).dereference();
		if (len.getType() != Type.INTEGER)
			throw new Oberon0SelectorException("Cannot cast the length of an array from " + len.getType() + " to " + Type.INTEGER + ".");
		OInteger length = (OInteger)len;
		// Add all variable instances to the variable scope
		for (String name : names)
		{
			OArray val = new OArray(length.getIntValue(), type);
			vars.addVariable(name, val);
		}
		return null;
	}
	@Override
	public void runForParameter(Oberon0VariableStack vars, Queue<OValue> parameters) throws Oberon0RuntimeException
	{
		assert(vars != null);
		assert(parameters != null);
		assert(names != null);
		assert(arrayLength != null);
		if (parameters.size() < names.size())
			throw new Oberon0IncorrectNumberOfArgumentsException();
		for (String name : names)
		{
			OArray param = parameters.poll().castToArray();
			if (isReference)
				vars.addVariable(name, param);
			else
			{
				if (arrayLength.run(vars).castToInteger().getIntValue() != param.getLength())
					throw new Oberon0ArrayLengthMismatch();
				OArray val = new OArray(param);
				vars.addVariable(name, val);
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
