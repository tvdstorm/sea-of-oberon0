package uva.oberon0.abstractsyntax.types;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.abstractsyntax.BaseNodeWithID;
import uva.oberon0.abstractsyntax.expressions.Reference;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an Identifier.
 */
public class ID extends BaseNode
{
	private final String _value;
	private BaseNode selector = null;

	public ID(String value)
	{
		assert value != null : "Value cannot be Null!";
		
		_value = value;
	}
	
	public BaseNode setSub(BaseNode value)
	{
		selector = value;
		return selector;
	}
	
	/**
	 * Get the Identifier Index Abstract Syntax Tree Node.
	 */
	public BaseNode getSelector()
	{
		return selector;
	}

	@Override 
	public boolean equals(Object compareTo)
	{
		//Determine if the same reference.
		if (this == compareTo) {
			return true;
		}
		
		//Determine compareTo is and ID.
		if ( !(compareTo instanceof ID) ) {
			return false;
		}
		
		//Determine match on text value.
		return _value.equals(((ID)compareTo).toString());
	}
	@Override 
	public int hashCode()
	{
		return _value.hashCode();
	}
	
	@Override
	public int eval(Scope scope)
	{
		return scope.getValue(this);
	}
	
	@Override
	public String toString() {
		return _value;
	}
	
	/**
	 * Gets the Identifier of different Node Types.
	 */
	public static ID get(BaseNode value)
	{
		if (value instanceof ID) {
			return (ID)value;
		}
		
		if (value instanceof BaseNodeWithID) {
			return ((BaseNodeWithID)value).getID();
		}
		
		if (value instanceof Reference) {
			return ((Reference)value).getID();
		}
		
		return null;
	}
}
