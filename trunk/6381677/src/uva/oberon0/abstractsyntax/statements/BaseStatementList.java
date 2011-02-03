package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNodeWithList;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a List of Statement Nodes.
*/
public class BaseStatementList extends BaseNodeWithList<BaseStatement> 
{
	@Override
	public int eval(Scope scope)
	{
		//Loop all Statement Nodes.
		for (BaseStatement statement : this)
		{
			//Evaluate Statement Node.
			if (statement.eval(scope) == 0)
			{
				//Assert incorrect evaluation!
				assert false : "Incorrect Statement Eval!";
				return 0;
			}
		}
		
		return 1;
	}
}
