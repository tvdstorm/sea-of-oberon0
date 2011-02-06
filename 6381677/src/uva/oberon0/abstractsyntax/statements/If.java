package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.expressions.Expression;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an If-Then-ElsIf-Else Statement.
*/
public class If extends Statement
{
	private final Expression 		_ifExpression;
	private final StatementList 	_ifStatements;
	private final IfListForElsIf 	_elsIfList;
	private final StatementList 	_elseStatementList;

	public If(Expression ifExpression, StatementList ifStatements, IfListForElsIf elsIfList, StatementList elseStatementList)
	{
		assert ifExpression != null 		: "No If Expression is available for the current If Statement!";
		assert ifStatements != null 		: "No If Statement List is available for the current If Statement!";
		assert elsIfList != null 			: "No ElsIf List is available for the current If Statement!";

		_ifExpression		= ifExpression;
		_ifStatements		= ifStatements;
		_elsIfList 			= elsIfList;
		_elseStatementList 	= elseStatementList;
	}

	@Override
	public int eval(Scope scope)
	{
		if (_ifExpression.eval(scope) == 1) {
			return _ifStatements.eval(scope);
		}
		
		for (IfPartForElsIf elsIf : _elsIfList)
		{
			if (elsIf.getExpression().eval(scope) == 1)
				return elsIf.getStatementList().eval(scope);
		}
		
		if (_elseStatementList != null) {
			return _elseStatementList.eval(scope);
		}
		
		return 1;
	}
}
