package ar.oberon0.interpreter.Lists;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
 * This is a base map that contains some functions that are used in by other maps. 
 * This map is used to store name value pairs where the value can be specified by the generic type. An example is the variables list in the context.
 */
public abstract class BaseMap<itemType> implements Iterable<Entry<String, itemType>> {
	/*
	 * The data of the map.
	 */
	private Map<String, itemType> items;

	/*
	 * Initialize the map.
	 */
	protected BaseMap() {
		this.items = new HashMap<String, itemType>();
	}

	/*
	 * Add a new item to the map.
	 */
	public final void addItem(final String name, final itemType item) {
		this.items.put(name, item);
	}

	/*
	 * return the item with the specified name.
	 */
	public final itemType getItem(final String name) {
		return this.items.get(name);
	}

	/*
	 * Get the numer of items in the list.
	 */
	public final int getCount() {
		return this.items.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public final Iterator<Entry<String, itemType>> iterator() {
		return this.items.entrySet().iterator();
	}
}
