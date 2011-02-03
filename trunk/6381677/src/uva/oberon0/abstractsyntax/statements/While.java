package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a While Statement.
*/
public class While extends BaseWithCondition 
{
	public While(BaseNode whileExpression, BaseStatementList whileStatements)
	{
		super(whileExpression, whileStatements);
	}
	
	@Override
	public int eval(Scope scope)
	{
		while (getExpression().eval(scope) == 1)
		{
			if (getStatements().eval(scope) == 0)
				return 0;
		}
		
		return 1;
	}
}
