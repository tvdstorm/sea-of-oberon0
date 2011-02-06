package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.runtime.Scope;


/**
 * @author Chiel Labee
 * This class represents an Integer Value.
*/
public class IntegerValue extends Expression
{
	private int _value = 0;

	public IntegerValue(String value)
	{
		//Set Value field.
		setValue(value);
	}

	//Gets the stored Integer Value.
	public int getValue()
	{
		return _value;
	}

	//Sets the stored Integer Value.
	private void setValue(String value)
	{
		//Validate and process input value.
		if (value != null)
		{
			//Parse input string value to integer.
			_value = Integer.parseInt(value);
		}
	}
	
	@Override
	public int eval(Scope scope) 
	{
		return _value;
	}
	
}
