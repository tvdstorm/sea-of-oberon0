package uva.oberon0.abstractsyntax;

/**
 * @author Chiel Labee
 * This class represents an Abstract Syntax Tree Node containing an Identifier Node.
 * This class is abstract.
 */
public abstract class BaseNodeWithID extends BaseNode
{
	protected BaseNodeWithID(ID id)
	{
		_id = id;
	}
	
	private ID _id = null;
	/**
	 * Gets the ID of the current Abstract Syntax Tree Node.
	 */
	public ID getID()
	{
		return _id;
	}
	/**
	 * Sets the ID for the current Abstract Syntax Tree Node.
	 */
	protected void setID(ID value)
	{
		_id = value;
	}
	
	@Override
	public boolean isValid()
	{
		return _id != null;
	}
}
