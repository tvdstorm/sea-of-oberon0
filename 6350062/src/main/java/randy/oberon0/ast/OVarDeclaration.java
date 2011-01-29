package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.ast.visitor.OASTNodeVisitor;
import randy.oberon0.exception.*;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class OVarDeclaration extends OBodyDeclaration
{
	protected String type;
	protected boolean bIsArray;
	protected boolean isReference;
	protected List<String> names;
	
	public OVarDeclaration(String _type, boolean _isReference, List<String> _names)
	{
		assert(_type != null);
		assert(_names != null);
		bIsArray = false;
		type = _type;
		isReference = _isReference;
		names = _names;
	}
	@Override
	public OValue run(RuntimeEnvironment environment) throws Oberon0RuntimeException
	{
		assert(environment != null);
		for (String name : names)
		{
			assert(name.length() >= 1);
			environment.addVariable(name, environment.resolveType(type).instantiate(environment));
		}
		return null;
	}
	public void runForParameter(RuntimeEnvironment environment, Queue<OValue> parameters) throws Oberon0RuntimeException
	{
		assert(environment != null);
		assert(parameters != null);
		assert(names != null);
		if (parameters.size() < names.size())
			throw new Oberon0IncorrectNumberOfArgumentsException();
		for (String name : names)
		{
			OValue param = parameters.poll();
			//if (param.getType() != type) // TODO: aanpassen
			//	throw new Oberon0TypeMismatchException(param.getType(), type);
			OValue val;
			if (isReference)
				val = param;
			else
			{	
				val = environment.resolveType(type).instantiate(environment);
				val.setValue(param);
			}
			environment.addVariable(name, val);
		}
	}
	public String getType()
	{
		return type;
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
