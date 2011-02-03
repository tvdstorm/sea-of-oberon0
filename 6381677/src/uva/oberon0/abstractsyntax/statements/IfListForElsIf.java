package uva.oberon0.abstractsyntax.statements;

import java.util.ArrayList;

public class IfListForElsIf
{
	private ArrayList<IfPartForElsIf> _items = new ArrayList<IfPartForElsIf>();
	
	public void add(IfPartForElsIf item)
	{
		_items.add(item);
	}
	
	public IfPartForElsIf getItem(int index)
	{
		return _items.get(index);
	}
	public Iterable<IfPartForElsIf> getItems()
	{
		return _items;
	}
}
