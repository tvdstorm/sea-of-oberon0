package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;


/**
 * @author Chiel Labee
 * This class represents a Statement containing an Conditional Expression and Statements List.
 * This class is abstract.
 */
public abstract class BaseWithCondition extends BaseWithList
{
	protected BaseWithCondition(BaseNode expression, BaseStatementList statements)
	{
		super(statements);
		
		_expression = expression;
	}

	private BaseNode _expression = null;
	protected BaseNode getExpression()
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
