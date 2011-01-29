package ar.oberon0.interpreter.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * An object of this class is filled by the grammer and than is used in the construction of variables and other lists.
 * In oberon 0 it is supported to create a list of variables of the same type in the notation of VAR a, b, c INTEGER. 
 * a b and c are the values that are stored in the identlist.
 */
public class IdentList implements Iterable<String>
{
	/*
	 * The list with identifiers.
	 */
	private List<String> _identifiers;

	/*
	 * Create a new IdentList and initialize the List with identifiers.
	 */
	public IdentList()
	{
		_identifiers = new ArrayList<String>();
	}

	/*
	 * Add a new identifier to the list.
	 */
	public void AddIdent(String name)
	{
		_identifiers.add(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<String> iterator()
	{
		return _identifiers.iterator();
	}

}
