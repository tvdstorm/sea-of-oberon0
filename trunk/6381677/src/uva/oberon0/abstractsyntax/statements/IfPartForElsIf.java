package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents the ElsIf part of an If-Then-ElsIf-Else Statement.
*/
public class IfPartForElsIf extends BaseWithCondition 
{
	public IfPartForElsIf(BaseNode elsifExpression, BaseStatementList elsIfStatements)
	{
		super(elsifExpression, elsIfStatements);
	}

	@Override
	public int eval(Scope scope) 
	{
		if (getExpression().eval(scope) == 1)
			return getStatements().eval(scope);
		
		return 0;
	}
}
