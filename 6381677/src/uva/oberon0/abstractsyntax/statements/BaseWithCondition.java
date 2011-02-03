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
	protected BaseWithCondition()
	{
	}

	private BaseExpression _expression = null;
	protected BaseExpression getExpression()
	{
		return _expression;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _expression != null;
	}
}
