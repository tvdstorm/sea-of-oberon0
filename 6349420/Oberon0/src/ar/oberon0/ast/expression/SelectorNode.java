package ar.oberon0.ast.expression;

import ar.oberon0.runtime.Context;
import ar.oberon0.runtime.DataField;
import ar.oberon0.shared.TechnicalException;

/*
 * With a selector a variable, constant, array, etc can be selected.
 */
public abstract class SelectorNode {
	/*
	 * The next node. If there is a next node the value of the next node has to
	 * be returned when interpreted. An example of a next node is an
	 * VarSelectorNode a with an ArraySelectorNode [2] (a[2]).
	 */
	private SelectorNode nextNode;

	public final SelectorNode getNextNode() {
		return this.nextNode;
	}

	public final void setNextNode(final SelectorNode nextNode) {
		this.nextNode = nextNode;
	}

	/*
	 * Get the DataField that is at the end of the chain.
	 */
	protected abstract DataField getItem(DataField parent, Context context) throws TechnicalException;
}
