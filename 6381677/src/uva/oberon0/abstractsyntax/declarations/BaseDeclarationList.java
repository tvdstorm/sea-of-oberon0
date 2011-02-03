package uva.oberon0.abstractsyntax.declarations;

import java.util.ArrayList;
import java.util.Iterator;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a List of Declaration Nodes.
*/
public class BaseDeclarationList extends BaseNode implements Iterable<BaseDeclaration> 
{
	public BaseDeclarationList()
	{
	}
		
	public void add(BaseDeclaration item)
	{
		_list.add(item);
	}
	protected ArrayList<BaseDeclaration> _list = new ArrayList<BaseDeclaration>();
	/**
	 * Gets a specific Declaration from the List based on the index number value.
	 */
	public BaseDeclaration get(int index)
	{
		return _list.get(index);
	}

	public int size()
	{
		return _list.size();
	}
	
	@Override
	public boolean isValid() {
		return _list.size()>0;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported eval!";
		return 0;
	}

	@Override
	public Iterator<BaseDeclaration> iterator() 
	{
		return _list.iterator();
	}

}
