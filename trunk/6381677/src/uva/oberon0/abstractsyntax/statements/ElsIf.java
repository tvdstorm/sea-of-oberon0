package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.expressions.Expression;
import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents the ElsIf part of an If-Then-ElsIf-Else Statement.
*/
public class ElsIf
{
	private final Expression 	_elsifExpression;
	private final StatementList _elsIfStatementList;
	
	public ElsIf(Expression elsIfExpression, StatementList elsIfStatements)
	{
		assert elsIfExpression != null 		: "No Els If Expression is available for the current If Statement!";
		assert elsIfStatements != null 		: "No Els If Statement List is available for the current If Statement!";

		assert elsIfExpression.getType() instanceof BooleanType;
		
		_elsifExpression = elsIfExpression;
		_elsIfStatementList = elsIfStatements;
	}
	
	public Expression getExpression()
	{
		return _elsifExpression;
	}
	public StatementList getStatementList()
	{
		return _elsIfStatementList;
	}
	
	public boolean checkTypes(Scope scope)
	{
		return _elsIfStatementList.checkTypes(scope);
	}
}
