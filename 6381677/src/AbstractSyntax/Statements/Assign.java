package AbstractSyntax.Statements;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;
import AbstractSyntax.ID;

/**
 * @author Chiel Labee
 * This class represents an Assignment Statement.
*/
public class Assign extends BaseStatement {

	public Assign(CommonTree parserTree) 
	{
		super(parserTree);
	}

	//Represents the Identifier Node that needs to be assigned.
	private ID _id = null;
	//Represents the Value Node that needs to be set to the Identifier Node.
	private BaseNode _value = null;
	
	@Override
	protected boolean addChildNode(BaseNode child)
	{
		//Set ID field.
		if (child instanceof ID && _id == null)
		{
			_id = (ID)child;
			return true;
		}	

		//Determine if the Value Node is not yet set.
		if (_value == null)
		{
			_value = child;
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _id != null
		&& _value != null;
	}
	
	@Override
	public int eval(Execution.Scope scope)
	{
		return scope.setValue(_id, _value.eval(scope));
	}
}
