package uva.oberon0.abstractsyntax.statements;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.expressions.BaseExpression;


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

	private BaseExpression _expression = null;
	protected BaseExpression getExpression()
	{
		return _expression;
	}
	
	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (super.addChildNode(child))
			return true;
		
		if (child instanceof BaseExpression)
		{
			_expression = (BaseExpression)child;
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
