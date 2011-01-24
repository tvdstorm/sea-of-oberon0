package ar.oberon0.interpreter.Lists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public abstract class BaseMap<itemType> implements Iterable<Entry<String,itemType>> 
{
	private Map<String,itemType> _items;
	
	protected Map<String, itemType> getVariables()
	{
		return _items;
	}
	
	protected BaseMap()
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
	
	/*
	 * Add the items of the parameter to the current list.
	 */
	public void Add(BaseMap<itemType> listToAdd)
	{
		_items.putAll(listToAdd._items);
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
