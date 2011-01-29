package ar.oberon0.interpreter.Memory;

/*
 * With a selector a variable, constant, array, etc can be selected.
 */
public abstract class Selector
{
	/*
	 * The next node. If there is a next node the value of the next node has to
	 * be returned when interpreted. An example of a next node is an
	 * IdentSelector a with an array indexer [2] (a[2]).
	 */
	private Selector _nextNode;

	/*
	 * Get the next node of the chain.
	 */
	public Selector getNextNode()
	{
		return _nextNode;
	}

	/*
	 * Set the next node.
	 */
	public void setNextNode(Selector nextNode)
	{
		_nextNode = nextNode;
	}

	/*
	 * Get the DataField that is at the end of the chain.
	 */
	protected abstract DataField getItem(DataField parent, Context context) throws Exception;
}
