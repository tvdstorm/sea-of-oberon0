package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an If-Then-ElsIf-Else Statement.
*/
public class If extends BaseWithCondition
{
	private final IfListForElsIf _elsIfList;
	private final BaseStatementList _elseStatementList;

	public If(BaseNode ifExpression, BaseStatementList ifStatements, IfListForElsIf elsIfList, BaseStatementList elseStatementList)
	{
		super(ifExpression, ifStatements);
		
		assert elsIfList != null 			: "No ElsIf List is available for the current If Statement!";

		_elsIfList 			= elsIfList;
		_elseStatementList 	= elseStatementList;
	}

	@Override
	public int eval(Scope scope)
	{
		if (getExpression().eval(scope) == 1)
			return getStatements().eval(scope);
		
		for (IfPartForElsIf elsIf : _elsIfList)
		{
			if (elsIf.getExpression().eval(scope) == 1)
				return elsIf.getStatements().eval(scope);
		}
		
		if (_elseStatementList != null)
			return _elseStatementList.eval(scope);
		
		return 1;
	}
}
