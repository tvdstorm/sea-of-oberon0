package randy.oberon0.ast;

import java.util.*;
import randy.oberon0.exception.*;
import randy.oberon0.exception.RuntimeException;
import randy.oberon0.interpreter.runtime.RuntimeEnvironment;
import randy.oberon0.value.*;

public class VarDeclaration extends BodyDeclaration
{
	protected String type;
	protected boolean bIsArray;
	protected boolean isReference;
	protected List<String> names;
	
	public VarDeclaration(String _type, boolean _isReference, List<String> _names)
	{
		assert(_type != null);
		assert(_names != null);
		bIsArray = false;
		type = _type;
		isReference = _isReference;
		names = _names;
	}
	@Override
	public Value run(RuntimeEnvironment environment) throws RuntimeException
	{
		assert(environment != null);
		for (String name : names)
		{
			assert(name.length() >= 1);
			environment.addVariable(name, environment.resolveType(type).instantiate(environment));
		}
		return null;
	}
	public void runForParameter(RuntimeEnvironment environment, Queue<Value> parameters) throws RuntimeException
	{
		assert(environment != null);
		assert(parameters != null);
		assert(names != null);
		if (parameters.size() < names.size())
			throw new IncorrectNumberOfArgumentsException();
		for (String name : names)
		{
			Value param = parameters.poll();
			//if (param.getType() != type) // TODO: aanpassen
			//	throw new Oberon0TypeMismatchException(param.getType(), type);
			Value val;
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
}
