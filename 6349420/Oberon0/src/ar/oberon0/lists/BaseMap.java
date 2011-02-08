package ar.oberon0.lists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * This is a base map that contains some functions that are used in by other maps. 
 * This map is used to store name value pairs where the value can be specified by the generic type. An example is the variables list in the context.
 */
public abstract class BaseMap<itemType> implements Iterable<Entry<String, itemType>> {

	private Map<String, itemType> items;

	protected BaseMap() {
		this.items = new HashMap<String, itemType>();
	}

	public final void addItem(final String name, final itemType item) {
		assert item != null : "The item parameter can't be null.";
		this.items.put(name, item);
	}

	public final itemType getItem(final String name) {
		return this.items.get(name);
	}

	public final int getCount() {
		return this.items.size();
	}

	@Override
	public final Iterator<Entry<String, itemType>> iterator() {
		return this.items.entrySet().iterator();
	}
}
