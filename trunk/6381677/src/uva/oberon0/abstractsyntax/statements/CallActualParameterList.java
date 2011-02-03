package uva.oberon0.abstractsyntax.statements;

import java.util.ArrayList;
import java.util.Iterator;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.declarations.BaseDeclaration;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Method Call Variable List.
*/
public class CallActualParameterList extends BaseNode implements Iterable<BaseNode> 
{
	private final ArrayList<BaseNode> _list = new ArrayList<BaseNode>();

	public CallActualParameterList()
	{
	}

	/**
	 * Adds an Declaration item to the List.
	 */	
	public void add(BaseNode item)
	{
		_list.add(item);
	}
	
	/**
	 * Gets a specific Method Call Variable from the List based on the index number value.
	 */
	public BaseNode get(int index)
	{
		return _list.get(index);
	}

	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported Eval!";
		return 0;
	}

	@Override
	public Iterator<BaseNode> iterator() {
		return _list.iterator();
	}
}
