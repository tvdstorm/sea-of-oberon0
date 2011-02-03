package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an If-Then-ElsIf-Else Statement.
*/
public class If extends BaseWithCondition
{
	public If(BaseNode ifExpression, BaseStatementList ifStatements, IfListForElsIf elsIfs, BaseStatementList elseStatements)
	{
		super(ifExpression, ifStatements);
		_elsIfs = elsIfs;
		_elseStatements = elseStatements;
	}

	private IfListForElsIf _elsIfs;
	private BaseStatementList _elseStatements;

	@Override
	public int eval(Scope scope)
	{
		if (getExpression().eval(scope) == 1)
			return getStatements().eval(scope);
		
		for (IfPartForElsIf elsIf : _elsIfs.getItems())
		{
			if (elsIf.getExpression().eval(scope) == 1)
				return elsIf.getStatements().eval(scope);
		}
		
		if (_elseStatements != null)
			return _elseStatements.eval(scope);
		
		return 1;
	}
}
