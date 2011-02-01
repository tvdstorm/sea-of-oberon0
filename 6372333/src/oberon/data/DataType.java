package oberon.data;

public abstract class DataType {
	private String _name;
	
	public DataType(String name)
	{
		_name = name;
	}
	
	public abstract int getValue();
	public abstract DataType DeepCopy(String newName);
	public abstract DataType ShallowCopy(String newName);
	
	public String getName()
	{
		return _name;
	}
	
	public void setValue(int value)
	{
		setValue(-1, value);
	}
	
	public void setValue(int index, int value)
	{
		if (this instanceof IntegerType)
		{
			if (index > -1)
			{
				//TODO throw
			}
			((IntegerType)this).setValueInternal(value);
		}
		else if(this instanceof IntegerArrayType)
		{
			if (index == -1)
			{
				//TODO throw
			}
			((IntegerArrayType)this).setValueAtIndex(index, value);
		}
	}
}
