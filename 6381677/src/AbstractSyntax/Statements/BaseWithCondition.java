package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;

/**
 * @author Chiel Labee
 * This class represents a Statement containing an Conditional Expression and Statements List.
 * This class is abstract.
 */
public abstract class BaseWithCondition extends BaseWithList
{
	protected BaseWithCondition(CommonTree parserTree)
	{
		super(parserTree);
	}

	private Expression _expression = null;
	protected Expression getExpression()
	{
		return _expression;
	}
	
	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (super.addChildNode(child))
			return true;
		
		if (child instanceof Expression)
		{
			_expression = (Expression)child;
			return true;
		}
				
		return false;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _expression != null;
	}
}
