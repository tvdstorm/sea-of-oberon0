package ar.oberon0.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IdentList implements Iterable<String> {

	private List<String> _identifiers;
	
	public IdentList()
	{
		_identifiers = new ArrayList<String>();
	}
	
	public void AddIdent(String name) 
	{
		_identifiers.add(name);
	}

	@Override
	public Iterator<String> iterator() 
	{
		return _identifiers.iterator();
	}

}
