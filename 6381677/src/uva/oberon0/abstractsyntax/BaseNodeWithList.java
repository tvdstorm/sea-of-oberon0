package uva.oberon0.abstractsyntax;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Chiel Labee
 *
 */
public abstract class BaseNodeWithList<E> extends BaseNode implements Iterable<E>
{
	private final List<E> _list;
	
	protected BaseNodeWithList() 
	{
		_list = new ArrayList<E>();
	}

	/**
	 * Adds an Item to the List.
	 */	
	public void add(E item)
	{
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