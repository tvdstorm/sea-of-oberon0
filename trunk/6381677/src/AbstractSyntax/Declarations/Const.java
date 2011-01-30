package AbstractSyntax.Declarations;

import org.antlr.runtime.tree.CommonTree;

import Execution.Scope;

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

	private AbstractSyntax.BaseNode _expression = null;
	/**
	 * Get the Expression for the current Constant Declaration.
	 */
	public AbstractSyntax.BaseNode getExpression()
	{
		return _expression;
	}

	@Override
	protected boolean addChildNode(AbstractSyntax.BaseNode child)
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
		if (_expression instanceof AbstractSyntax.Types.IntValue)
			return ((AbstractSyntax.Types.IntValue)_expression).getValue();
		
		assert false : "Unsupported Const Data Type!";
		return 0;
	}
}
