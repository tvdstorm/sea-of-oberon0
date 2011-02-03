package uva.oberon0.abstractsyntax.statements;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IfListForElsIf implements Iterable<IfPartForElsIf>
{
	private final List<IfPartForElsIf> _list;
	
	public IfListForElsIf()
	{
		_list = new LinkedList<IfPartForElsIf>();
	}
	
	/**
	 * Adds an IfEls Statement item to the List.
	 */	
	public void add(IfPartForElsIf item)
	{
		_list.add(item);
	}

	@Override
	public Iterator<IfPartForElsIf> iterator() {
		return _list.iterator();
	}
}
