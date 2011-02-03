package uva.oberon0.abstractsyntax.statements;

import java.util.ArrayList;
import java.util.Iterator;

public class IfListForElsIf implements Iterable<IfPartForElsIf>
{
	private final ArrayList<IfPartForElsIf> _items = new ArrayList<IfPartForElsIf>();
	
	public void add(IfPartForElsIf item)
	{
		_items.add(item);
	}

	@Override
	public Iterator<IfPartForElsIf> iterator() {
		return _items.iterator();
	}
}
