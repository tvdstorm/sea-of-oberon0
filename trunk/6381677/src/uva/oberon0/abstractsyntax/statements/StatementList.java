package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseList;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a List of Statement Nodes.
*/
public class StatementList extends BaseList<Statement> 
{
	public int eval(Scope scope)
	{
		//Loop all Statement Nodes.
		for (Statement statement : this)
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
