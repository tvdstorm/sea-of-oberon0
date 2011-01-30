package AbstractSyntax.Declarations;

import java.util.ArrayList;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.ID;
import AbstractSyntax.BaseNode;
import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents a Variable Declaration Node that is passed by Value.
*/
public class Var extends BaseDeclaration
{
	public Var(CommonTree parserTree)
	{
		super(parserTree);

		//Determine and set IsArray field.
		//True when the first node after the IDs (3th last node) should be of the type ARRAY.
		_isArray = parserTree.getChildCount() >= 4 
		&& parserTree.getChild(parserTree.getChildCount() - 3).getType() == ANTLR.OberonParser.ARRAY;
	}
	
	//A list of alternative ID nodes to determine if this variable can be split into multiple variable nodes.
	private ArrayList<ID> _alternativeIDs = null;
	
	private boolean _isArray = false;
	/**
	 * Determines if this Variable Declaration Node is an Array.
	 */
	public boolean isArray()
	{
		return _isArray;
	}
	
	private BaseNode _arrayLength = null;
	/**
	 * Gets the Length Node of the Array.
	 */
	public BaseNode getArrayLength()
	{
		return _arrayLength;
	}
	/**
	 * Gets the Length Execution Scope Value of the Array.
	 */
	public int getArrayLength(Scope scope)
	{
		return _arrayLength.eval(scope);
	}
	
	private BaseNode _dataType = null;
	/**
	 * Gets the Data Type of this Variable Declaration Node.
	 */
	public BaseNode getDataType()
	{
		return _dataType;
	}
	
	@Override
	protected boolean addChildNode(BaseNode child)
	{
		if (super.addChildNode(child))
			return true;

		//Determine and set Array length.
		if (_isArray && _arrayLength == null)
		{
			_arrayLength = child;
			return true;
		}
		
		//Determine alternative IDs allowing for split of this node.
		if (child instanceof ID)
		{
			if (_alternativeIDs == null)
				_alternativeIDs = new ArrayList<ID>(1);
			
			_alternativeIDs.add((ID)child);
			return true;
		}
		
		
		//Determine and set DataType field.
		if (_dataType == null)
		{
			_dataType = child;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _dataType != null
		&& (!_isArray || _arrayLength != null);
	}
	

	@Override
	public boolean canSplit()
	{
		//Determine this node can be split based on ID.
		return _alternativeIDs != null && _alternativeIDs.size() > 0;
	}
	
	@Override
	public BaseNode split()
	{
		if (!canSplit())
			return null;
		
		//Create clone as result node.
		Var result = null;
		
		try
		{
			result = (Var)this.clone();
		}
		catch (CloneNotSupportedException ex)
		{
			assert false : "Unsupported Clone while Split!";
			return null;
		}
		
		//Set the first alternative ID to the result node.
		ID resultID = _alternativeIDs.get(0);
		result.setID(resultID);

		//Remove the first alternative ID;
		_alternativeIDs.remove(resultID);
		if (_alternativeIDs.size() == 0)
			_alternativeIDs = null;

		return result;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		return 0;
	}
}
