package AbstractSyntax.Types;

import org.antlr.runtime.tree.CommonTree;

import AbstractSyntax.BaseNode;
import Execution.Scope;

/**
 * @author Chiel Labee
 * This class represents an Integer Value.
*/
public class IntValue extends BaseNode
{
	public IntValue(CommonTree parserTree)
	{
		super(parserTree);

		//Set Value field.
		setValue(parserTree.getText());
	}

	private int _value = 0;
	//Gets the stored Integer Value.
	public int getValue()
	{
		return _value;
	}
	//Sets the stored Integer Value.
	public void setValue(String value)
	{
		//Validate and process input value.
		if (value != null)
		{
			//Parse input string value to integer.
			_value = Integer.parseInt(value);
		}
	}
	
	@Override
	protected boolean addChildNode(BaseNode child)
	{
		return false;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		return getValue();
	}
}
