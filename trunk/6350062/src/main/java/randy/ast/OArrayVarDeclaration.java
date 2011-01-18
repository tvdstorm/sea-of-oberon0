package randy.ast;

import java.util.*;
import randy.exception.*;
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
	public OValue run(Oberon0VariableStack vars) throws Oberon0RuntimeException
	{
		OValue len = arrayLength.run(vars).dereference();
		if (!len.getType().isInteger())
			throw new Oberon0SelectorException("Cannot cast the length of an array from " + len.getType() + " to " + Type.INTEGER + ".");
		OInteger length = (OInteger)len;
		for (String name : names)
		{
			OArray val = new OArray(length.getIntValue(), type);
			vars.addVariable(name, val);
		}
		return null;
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
