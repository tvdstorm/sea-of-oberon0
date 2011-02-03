package uva.oberon0.abstractsyntax.declarations;

import uva.oberon0.abstractsyntax.BaseNodeWithList;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Declaration List.
*/
public class BaseDeclarationList extends BaseNodeWithList<BaseDeclaration> 
{
	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported eval!";
		return 0;
	}

}
