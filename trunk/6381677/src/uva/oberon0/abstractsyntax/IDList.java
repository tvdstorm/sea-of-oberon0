package uva.oberon0.abstractsyntax;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


/**
 * @author Chiel Labee
 * This class represents an Identifier List.
 */
public class IDList implements Iterable<ID> 
{
	private final List<ID> _list;

	public IDList()
	{
		_list = new LinkedList<ID>();
	}
	
	/**
	 * Adds an Identifier item to the List.
	 */
	public void add(ID id)
	{
		_list.add(id);
	}

	@Override
	public Iterator<ID> iterator() {
		return _list.iterator();
	}
}
