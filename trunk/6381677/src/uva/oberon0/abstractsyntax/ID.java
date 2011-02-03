package uva.oberon0.abstractsyntax;

import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an Identifier.
 */
public class ID extends BaseNode
{
	private final String _value;
	private BaseNode _sub = null;

	public ID(String value)
	{
		assert value != null : "Value cannot be Null!";
		
		_value = value;
	}
	
	public BaseNode setSub(BaseNode value)
	{
		_sub = value;
		return _sub;
	}
	
	/**
	 * Get the Identifier Index Abstract Syntax Tree Node.
	 */
	public BaseNode getSub()
	{
		return _sub;
	}
	/**
	 * Get the Identifier Index Value from the Execution Scope.
	 */
	public int getSub(Scope scope)
	{
		return _sub.eval(scope);
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
		return _value.equals(((ID)compareTo).toString());
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
	
	@Override
	public String toString() {
		return _value;
	}
}
