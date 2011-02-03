package uva.oberon0.abstractsyntax.statements;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents a Method Call Variable List.
*/
public class CallVars extends BaseNode 
{
	public CallVars()
	{
	}

	private ArrayList<BaseNode> _items = new ArrayList<BaseNode>();
	/**
	 * Gets the List of Method Call Variables.
	 */
	public ArrayList<BaseNode> getItems()
	{
		return _items;
	}
	/**
	 * Gets a specific Method Call Variable from the List based on the index number value.
	 */
	public BaseNode getItem(int index)
	{
		return _items.get(index);
	}

	@Override
	public int eval(Scope scope) 
	{
		assert false : "Unsupported Eval!";
		return 0;
	}
	
	@Override
	public boolean isValid() {
		return true;
	}
}
