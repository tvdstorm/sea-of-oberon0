package ar.oberon0.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * An object of this class is filled by the grammer and than is used in the construction of variables and other lists.
 * In oberon 0 it is supported to create a list of variables of the same type in the notation of VAR a, b, c INTEGER. 
 * a b and c are the values that are stored in the identlist.
 */
public class IdentList implements Iterable<String> {

	private List<String> identifiers;

	public final List<String> getIdentifiers() {
		return this.identifiers;
	}

	public IdentList() {
		this.identifiers = new ArrayList<String>();
	}

	public final void addIdent(final String name) {
		this.identifiers.add(name);
	}

	@Override
	public final Iterator<String> iterator() {
		return this.identifiers.iterator();
	}
}
