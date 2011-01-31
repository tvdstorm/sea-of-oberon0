package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.TechnicalException;

/*
 * With a selector a variable, constant, array, etc can be selected.
 */
public abstract class Selector {
	/*
	 * The next node. If there is a next node the value of the next node has to
	 * be returned when interpreted. An example of a next node is an
	 * IdentSelector a with an array indexer [2] (a[2]).
	 */
	private Selector nextNode;

	/*
	 * Get the next node of the chain.
	 */
	public final Selector getNextNode() {
		return this.nextNode;
	}

	/*
	 * Set the next node.
	 */
	public final void setNextNode(final Selector nextNode) {
		this.nextNode = nextNode;
	}

	/*
	 * Get the DataField that is at the end of the chain.
	 */
	protected abstract DataField getItem(DataField parent, Context context)
			throws TechnicalException;
}
