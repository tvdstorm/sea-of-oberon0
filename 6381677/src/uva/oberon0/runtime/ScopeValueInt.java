package uva.oberon0.runtime;

/**
 * @author Chiel Labee
 * This class represents an Integer based Execution Scope Value.
*/
public class ScopeValueInt extends ScopeValue 
{
	private int _value;
	
	public ScopeValueInt(Scope scope)
	{
		_value = 0;
	}
	public ScopeValueInt(Scope scope, int value)
	{
		_value = value;
	}
	
	public int getValue() 
	{
		return _value;
	}

	public void setValue(int valueNew) 
	{
		_value = valueNew;
	}
}
