package uva.oberon0.abstractsyntax;

/**
 * @author Chiel Labee
 * This class represents an Abstract Syntax Tree Node containing an Identifier Node.
 * This class is abstract.
 */
public abstract class BaseNodeWithID extends BaseNode
{
	private final ID _id;

	protected BaseNodeWithID(ID id)
	{
		assert id != null : "No ID available!";
		
		_id = id;
	}
	
	/**
	 * Gets the ID of the current Abstract Syntax Tree Node.
	 */
	public ID getID()
	{
		return _id;
	}
}
