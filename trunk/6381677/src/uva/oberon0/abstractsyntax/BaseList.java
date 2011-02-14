package uva.oberon0.abstractsyntax;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Chiel Labee
 *
 */
public abstract class BaseList<E> implements Iterable<E>
{
	private final List<E> _list;
	
	protected BaseList() 
	{
		_list = new LinkedList<E>();
	}

	/**
	 * Adds an Item to the List.
	 */	
	public void add(E item)
	{
		assert item != null;
		_list.add(item);
	}
	/**
	 * Gets a specific Item from the List based on the index number value.
	 */
	public E get(int index)
	{
		return _list.get(index);
	}

	/**
	 * Gets the Length of the List.
	 */
	public int size()
	{
		return _list.size();
	}
	
	@Override
	public Iterator<E> iterator() {
		return _list.iterator();
	}

}
