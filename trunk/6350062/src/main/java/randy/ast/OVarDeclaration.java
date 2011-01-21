package randy.ast;

import java.util.*;
import org.antlr.runtime.tree.Tree;
import randy.exception.*;
import randy.generated.Oberon0Parser;
import randy.interpreter.Oberon0VariableStack;
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
	public OValue runForParameter(Oberon0VariableStack vars, Queue<OValue> parameters) throws Oberon0RuntimeException
	{
		// TODO: asserts toevoegen
		if (parameters.size() < names.size())
			throw new Oberon0IncorrectNumberOfArgumentsException();
		for (String name : names)
		{
			if (parameters.peek().getType().isArray() && bIsArray)
			{
				// Ok
			}
			else if (!parameters.peek().getType().equals(type) || (parameters.peek().getType().isArray() && !bIsArray) || (!parameters.peek().getType().isArray() && bIsArray))
				throw new Oberon0TypeMismatchException(parameters.peek().getType(), type);
			if (isReference)
			{
				vars.addVariable(name, parameters.poll());
			}
			else
			{
				if (bIsArray)
				{
					// TODO: kijken of array length overeenkomen en dit opsplitsen met OArrayVarDeclaration
					OArray val = new OArray((OArray)parameters.poll());
					vars.addVariable(name, val);
				}
				else
				{
					OValue val = OValue.makeNew(type);
					val.setValue(parameters.poll());
					vars.addVariable(name, val);
				}
			}
		}
		return null;
	}
	public static OVarDeclaration buildVarDeclaration(Tree tree) throws Oberon0Exception
	{
		assert(tree.getType() == Oberon0Parser.VAR || tree.getType() == Oberon0Parser.REFVAR);
		assert(tree.getChildCount() >= 1);
		assert(tree.getType() == Oberon0Parser.IDENT);
		boolean isReference = false;
		if (tree.getType() == Oberon0Parser.REFVAR)
			isReference = true;
		Type type = new Type(tree.getChild(0).getText());
		List<String> names = new Vector<String>();
		for (int i=1;i<tree.getChildCount();i++)
		{
			names.add(tree.getChild(i).getText());
		}
		if (type.isArray())
		{
			type = new Type(tree.getChild(0).getChild(0).getChild(0).getText());
			OExpression arrayLength = OExpression.buildExpression(tree.getChild(0).getChild(1).getChild(0));
			return new OArrayVarDeclaration(type, isReference, names, arrayLength);
		}
		else
			return new OVarDeclaration(type, isReference, names);
	}
	@Override
	public void accept(OASTNodeVisitor visitor) throws Oberon0Exception
	{
		visitor.visitBefore(this);
		visitor.visit(this);
		visitor.visitAfter(this);
	}
}
