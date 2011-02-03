package uva.oberon0.abstractsyntax.types;

import org.antlr.runtime.tree.CommonTree;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an Integer Value.
*/
public class IntValue extends BaseType
{
	public IntValue(String value)
	{
		//Set Value field.
		setValue(value);
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
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public int eval(Scope scope) 
	{
		return getValue();
	}
	
}
