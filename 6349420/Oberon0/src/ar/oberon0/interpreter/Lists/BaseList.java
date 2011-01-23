package ar.oberon0.interpreter.Lists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public abstract class BaseList<itemType> implements Iterable<Entry<String,itemType>> 
{
	private Map<String,itemType> _items;
	
	protected Map<String, itemType> getVariables()
	{
		return _items;
	}
	
	protected BaseList()
	{
		_items = new HashMap<String,itemType>();
	}

	public void AddItem(String name, itemType item)
	{
		_items.put(name, item);
	}
		
	public itemType getItem(String name)
	{
		return _items.get(name);
	}
	
	public int getCount()
	{
		return _items.size();
	}

	@Override
	public Iterator<Entry<String,itemType>> iterator() {
		return _items.entrySet().iterator();
	}
}
