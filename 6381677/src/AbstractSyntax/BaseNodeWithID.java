package AbstractSyntax;

import org.antlr.runtime.tree.CommonTree;

/**
 * @author Chiel Labee
 * This class represents an Abstract Syntax Tree Node containing an Identifier Node.
 * This class is abstract.
 */
public abstract class BaseNodeWithID extends BaseNode
{
	protected BaseNodeWithID(CommonTree parserTree)
	{
		super(parserTree);
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
	protected boolean addChildNode(AbstractSyntax.BaseNode child)
	{
		//Set ID field.
		if (child instanceof ID && _id == null)
		{
			_id = (ID)child;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _id != null;
	}
}
