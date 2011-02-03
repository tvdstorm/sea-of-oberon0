package uva.oberon0.abstractsyntax;

import java.util.ArrayList;
import java.util.Iterator;

public class IDList implements Iterable<ID> 
{
	public IDList()
	{
	}
	
	private ArrayList<ID> _list = new ArrayList<ID>();
	
	public void add(ID id)
	{
		_list.add(id);
	}

	@Override
	public Iterator<ID> iterator() {
		return _list.iterator();
	}
}
