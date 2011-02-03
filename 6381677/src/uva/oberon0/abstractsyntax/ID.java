package uva.oberon0.abstractsyntax;

import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an Identifier Node.
 */
public class ID extends BaseNode
{
	public ID(String value)
	{
		_value = value;
	}
	
	private String _value = null;
	/**
	 * Get the Identifier as a String value.
	 */
	public String getValue()
	{
		return _value;
	}
	
	private ID _subID = null;
	public ID addID(String value)
	{
		_subID = new ID(value);
		return _subID;
	}
	public ID addIndexID(BaseNode value)
	{
		_index = value;
		return this;
	}
	
	private BaseNode _index = null;
	/**
	 * Get the Identifier Index Abstract Syntax Tree Node.
	 */
	public BaseNode getIndex()
	{
		return _index;
	}
	/**
	 * Get the Identifier Index Value from the Execution Scope.
	 */
	public int getIndex(Scope scope)
	{
		return _index.eval(scope);
	}

	@Override
	public boolean isValid()
	{
		return _value != null;
	}

	@Override 
	public boolean equals(Object compareTo)
	{
		//Determine if the same reference.
		if (this == compareTo)
			return true;
		
		//Determine compareTo is and ID.
		if ( !(compareTo instanceof ID) ) 
			return false;
		
		//Determine match on text value.
		return _value.equals(((ID)compareTo).getValue());
	}
	@Override 
	public int hashCode()
	{
		return _value.hashCode();
	}
	
	@Override
	public int eval(uva.oberon0.runtime.Scope scope)
	{
		return scope.getValue(this);
	}
	
}
