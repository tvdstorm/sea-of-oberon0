package randy.ast;

import java.util.*;
import randy.exception.Oberon0Exception;
import randy.interpreter.Oberon0VariableStack;
import randy.value.*;

public class OArrayVarDeclaration extends OVarDeclaration
{
	protected OExpression arrayLength;
	
	public OArrayVarDeclaration(Type _type, boolean _bIsReference, List<String> _names, OExpression _arrayLength)
	{
		super(_type, _bIsReference, _names);
		bIsArray = true;
		arrayLength = _arrayLength;
	}
	@Override
	public void print(String indent)
	{
		for (String name : names)
		{
			System.out.println(indent + type + "[] " + name);
			arrayLength.print(indent + "\t");
		}
	}
	@Override
	public OValue run(Oberon0VariableStack vars) throws Oberon0Exception
	{
		OValue len = arrayLength.run(vars).dereference();
		if (!len.getType().isInteger())
			throw new Oberon0Exception("Length of array is not an integer...");
		OInteger length = (OInteger)len;
		for (String name : names)
		{
			OArray val = new OArray(length.getIntValue(), type);
			vars.addVariable(name, val);
		}
		return null;
	}
}