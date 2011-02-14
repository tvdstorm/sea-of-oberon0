package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseList;
import uva.oberon0.runtime.Scope;

public class ElsIfList extends BaseList<ElsIf>
{
	public boolean checkTypes(Scope scope)
	{
		for (ElsIf statement : this)
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
