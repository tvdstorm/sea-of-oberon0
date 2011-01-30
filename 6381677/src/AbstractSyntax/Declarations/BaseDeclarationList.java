package AbstractSyntax.Declarations;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;
import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents a List of Declaration Nodes.
*/
public class BaseDeclarationList extends BaseNode 
{
	public BaseDeclarationList(CommonTree parserTree)
	{
		super(parserTree);
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
	protected boolean addChildNode(BaseNode child)
	{
		if (child instanceof BaseDeclaration)
		{
			_items.add((BaseDeclaration)child);
			return true;
		}
		
		return false;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported eval!";
		return 0;
	}
}
