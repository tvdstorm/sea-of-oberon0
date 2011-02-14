package uva.oberon0.abstractsyntax.expressions;

import uva.oberon0.abstractsyntax.types.IntegerType;
import uva.oberon0.runtime.Scope;

/**
 * @author Chiel Labee
 * This class represents an Integer Value.
*/
public class IntegerValue extends Expression {
	
	private int _value = 0;

	public IntegerValue(String value)
	{
		super(new IntegerType());
		
		//Parse input string value to integer.
		_value = Integer.parseInt(value);
	}
	
	@Override
	public int eval(Scope scope) 
	{
		return _value;
	}
}
