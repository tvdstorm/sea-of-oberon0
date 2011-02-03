package uva.oberon0.abstractsyntax.statements;

import java.util.ArrayList;
import java.util.Iterator;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.declarations.BaseDeclaration;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a List of Statement Nodes.
*/
public class BaseStatementList extends BaseNode  implements Iterable<BaseStatement> 
{
	private final ArrayList<BaseStatement> _list = new ArrayList<BaseStatement>();

	public BaseStatementList()
	{
	}
	
	public void add(BaseStatement item)
	{
		assert item != null : "Item is null!";
		_list.add(item);
	}

	@Override
	public int eval(Scope scope)
	{
		//Loop all Statement Nodes.
		for (BaseStatement statement : _list)
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

	@Override
	public Iterator<BaseStatement> iterator() {
		return _list.iterator();
	}
}
