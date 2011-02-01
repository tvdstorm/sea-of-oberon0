package uva.oberon0.abstractsyntax.declarations;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Constanct Declaration Node.
*/
public class Const extends BaseDeclaration
{
	public Const(CommonTree parserTree)
	{
		super(parserTree);
	}

	private uva.oberon0.abstractsyntax.BaseNode _expression = null;
	/**
	 * Get the Expression for the current Constant Declaration.
	 */
	public uva.oberon0.abstractsyntax.BaseNode getExpression()
	{
		return _expression;
	}

	@Override
	protected boolean addChildNode(uva.oberon0.abstractsyntax.BaseNode child)
	{
		if (super.addChildNode(child))
			return true;
				
		_expression = child;
		return true;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid() 
		&& _expression != null;
	}

	@Override
	public int eval(Scope scope)
	{
		if (_expression instanceof uva.oberon0.abstractsyntax.types.IntValue)
			return ((uva.oberon0.abstractsyntax.types.IntValue)_expression).getValue();
		
		assert false : "Unsupported Const Data Type!";
		return 0;
	}
}
