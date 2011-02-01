package uva.oberon0.abstractsyntax;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.types.IntValue;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an Identifier Node.
 */
public class ID extends BaseNode
{
	public ID(CommonTree parserTree)
	{
		super(parserTree);

		//Set Value field.
		_value = parserTree.getText();
	}
	
	private String _value = null;
	/**
	 * Get the Identifier as a String value.
	 */
	public String getValue()
	{
		return _value;
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
	protected boolean addChildNode(uva.oberon0.abstractsyntax.BaseNode child)
	{
		if (child instanceof ID || child instanceof IntValue)
		{
			_index = child;
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isValid()
	{
		return super.isValid()
		&& _value != null;
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
