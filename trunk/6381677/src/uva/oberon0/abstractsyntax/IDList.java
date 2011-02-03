package uva.oberon0.abstractsyntax;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * @author Chiel Labee
 * This class represents an Identifier List.
 */
public class IDList implements Iterable<ID> 
{
	private final ArrayList<ID> _list = new ArrayList<ID>();

	public IDList()
	{
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
