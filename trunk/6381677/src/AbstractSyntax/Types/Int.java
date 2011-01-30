package AbstractSyntax.Types;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;
import Execution.Scope;

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
