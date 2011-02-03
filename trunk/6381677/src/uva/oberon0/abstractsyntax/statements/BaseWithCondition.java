package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;


/**
 * @author Chiel Labee
 * This class represents a Statement containing an Conditional Expression and Statements List.
 * This class is abstract.
 */
public abstract class BaseWithCondition extends BaseWithList
{
	private final BaseNode _expression;

	protected BaseWithCondition(BaseNode expression, BaseStatementList statements)
	{
		super(statements);
		
		assert expression != null : "No Expression is available for the current Node!";
		
		_expression = expression;
	}

	protected BaseNode getExpression()
	{
		return _expression;
	}
}
