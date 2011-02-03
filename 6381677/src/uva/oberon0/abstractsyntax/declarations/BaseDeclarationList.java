package uva.oberon0.abstractsyntax.declarations;

import java.util.ArrayList;
import java.util.Iterator;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Declaration List.
*/
public class BaseDeclarationList extends BaseNode implements Iterable<BaseDeclaration> 
{
	private final ArrayList<BaseDeclaration> _list = new ArrayList<BaseDeclaration>();

	public BaseDeclarationList()
	{
	}

	/**
	 * Adds an Declaration item to the List.
	 */	
	public void add(BaseDeclaration item)
	{
		_list.add(item);
	}
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
