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
	
	public boolean checkTypes(Scope scope)
	{
		for (Statement statement : this)
		{
			//TypeCheck Statement Node.
			if (!statement.checkTypes(scope))
			{
				//Assert incorrect evaluation!
				assert false : "Incorrect Statement TypeCheck!";
				return false;
			}
		}
		
		return true;
	}
}
