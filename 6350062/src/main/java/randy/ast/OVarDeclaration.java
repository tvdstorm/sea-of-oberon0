package randy.ast;

import java.util.*;
import randy.exception.*;
import randy.interpreter.runtime.Oberon0VariableStack;
import randy.value.*;

public class OVarDeclaration extends OBodyDeclaration
{
	protected Type type;
	protected boolean bIsArray;
	protected boolean isReference;
	protected List<String> names;
	
	public OVarDeclaration(Type _type, boolean _isReference, List<String> _names)
	{
		assert(_type != null);
		assert(_names != null);
		bIsArray = false;
		type = _type;
		isReference = _isReference;
		names = _names;
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		assert(vars != null);
		for (String name : names)
		{
			assert(name.length() >= 1);
			vars.addVariable(name, OValue.makeNew(type));
		}
		return null;
	}
	public void runForParameter(Oberon0VariableStack vars, Queue<OValue> parameters) throws Oberon0RuntimeException
	{
		assert(vars != null);
		assert(parameters != null);
		assert(names != null);
		if (parameters.size() < names.size())
			throw new Oberon0IncorrectNumberOfArgumentsException();
		for (String name : names)
		{
			OValue param = parameters.poll();
			if (param.getType() != type)
				throw new Oberon0TypeMismatchException(param.getType(), type);
			OValue val;
			if (isReference)
				val = param;
			else
			{	
				val = OValue.makeNew(type);
				val.setValue(param);
			}
			vars.addVariable(name, val);
		}
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
