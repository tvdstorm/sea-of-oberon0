package uva.oberon0.abstractsyntax.types;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an Integer Value Type.
*/
public class Int  extends BaseNode
{
	public Int(CommonTree parserTree)
	{
		super(parserTree);
	}

	@Override
	protected boolean addChildNode(BaseNode child) 
	{
		return false;
	}

	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported Eval!";
		return 0;
	}
}
