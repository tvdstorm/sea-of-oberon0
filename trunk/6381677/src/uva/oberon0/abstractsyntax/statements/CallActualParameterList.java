package uva.oberon0.abstractsyntax.statements;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.BaseNodeWithList;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Method Call Variable List.
*/
public class CallActualParameterList extends BaseNodeWithList<BaseNode> 
{
	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported Eval!";
		return 0;
	}
}
