package uva.oberon0.abstractsyntax.declarations;

import java.util.ArrayList;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a List of Declaration Nodes.
*/
public class BaseDeclarationList extends BaseNode 
{
	public BaseDeclarationList()
	{
	}
		
	public void add(BaseDeclaration item)
	{
		_items.add(item);
	}
	protected ArrayList<BaseDeclaration> _items = new ArrayList<BaseDeclaration>();
	/**
	 * Gets the List of Declarations.
	 */
	public ArrayList<BaseDeclaration> getItems()
	{
		return _items;
	}
	/**
	 * Gets a specific Declaration from the List based on the index number value.
	 */
	public BaseDeclaration getItem(int index)
	{
		return _items.get(index);
	}

	@Override
	public boolean isValid() {
		return _items.size()>0;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported eval!";
		return 0;
	}

}
