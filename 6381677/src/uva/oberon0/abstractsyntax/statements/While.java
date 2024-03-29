package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.expressions.Expression;
import uva.oberon0.abstractsyntax.types.BooleanType;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a While Statement.
*/
public class While extends Statement 
{
	private final Expression 	_whileExpression;
	private final StatementList _whileStatementList;
	
	public While(Expression whileExpression, StatementList whileStatements)
	{
		assert whileExpression != null 		: "No While Expression is available for the current If Statement!";
		assert whileStatements != null 		: "No While Statement List is available for the current If Statement!";

		assert whileExpression.getType() instanceof BooleanType;
		
		_whileExpression = whileExpression;
		_whileStatementList = whileStatements;
	}
	
	@Override
	public int eval(Scope scope)
	{
		while (_whileExpression.eval(scope) == 1)
		{
			if (_whileStatementList.eval(scope) == 0) {
				return 0;
			}
		}
		
		return 1;
	}

	@Override
	public boolean checkTypes(Scope scope) {
		return _whileStatementList.checkTypes(scope);
	}
}
