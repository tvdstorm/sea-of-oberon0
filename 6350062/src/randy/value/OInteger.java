package randy.value;

public class OInteger extends OValue
{
	private int value;
	
	public OInteger(int _value)
	{
		value = _value;
	}
	public int getValue()
	{
		return value;
	}
	public void setValue(int _value)
	{
		value = _value;
	}
	public String toString()
	{
		return "" + value;
	}
}
