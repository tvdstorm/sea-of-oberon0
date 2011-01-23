package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Memory.*;

public class IntegerNode implements DataType {

	private int _value;
			
	public IntegerNode()
	{
		this(0);
	}
	
	public IntegerNode(int value)
	{
		_value = value;
	}
	
	@Override
	public int hashCode() 
	{
		return Integer.valueOf(_value).hashCode();
	}

	@Override
	public boolean equals(Object obj) 
	{
		if(obj.getClass() != IntegerNode.class)
			return false;
		return _value == ((IntegerNode)obj)._value;
	}

	@Override
	public DataType Clone() 
	{
		return new IntegerNode(_value);
	}

	@Override
	public Object Interpret(Context context) throws Exception 
	{
		return this;
	}
	
	public DataType MultiplyBy(DataType value) throws Exception
	{
		if(!AreSameType(this,value))
			throw new Exception("Could not multiply the type " +IntegerNode.class + " with a object of type " + value.getClass() + ".");
		
		return new IntegerNode(_value * ((IntegerNode)value)._value); 
	}
	
	@Override
	public String toString() 
	{
		return "" + _value;
	}

	@Override
	public DataType Add(DataType value) throws Exception 
	{
		if(!AreSameType(this,value))
			throw new Exception("Could not add the value of type " +IntegerNode.class + " with the value of type " + value.getClass() + ".");
		
		return new IntegerNode(_value + ((IntegerNode)value)._value);
	}
	
	private boolean AreSameType(Object o1, Object o2)
	{
		if(o1.getClass() == o2.getClass())
			return true;
		else
			return false;
	}

	@Override
	public DataType Negate() {
		return new IntegerNode(-_value);
	}

	@Override
	public DataType Subtract(DataType value) throws Exception {
		if(!AreSameType(this,value))
			throw new Exception("Could not subtract the value of type " +IntegerNode.class + " from the value of type " + value.getClass() + ".");
		
		return new IntegerNode(_value - ((IntegerNode)value)._value);
	}

	@Override
	public int compareTo(Object arg0) 
	{
		if(!AreSameType(this,arg0))
			return -1;
		else
			return Integer.valueOf(_value).compareTo(((IntegerNode)arg0)._value);
	}

	@Override
	public DataType Divide(DataType value) throws Exception 
	{
		if(!AreSameType(this,value))
			throw new Exception("Could not divide the value of type " +IntegerNode.class + " from the value of type " + value.getClass() + ".");
		
		return new IntegerNode(_value / ((IntegerNode)value)._value);
	}

	@Override
	public DataType Modulo(DataType value) throws Exception 
	{
		if(!AreSameType(this,value))
			throw new Exception("Could not modulo the value of type " +IntegerNode.class + " from the value of type " + value.getClass() + ".");
		
		return new IntegerNode(_value % ((IntegerNode)value)._value);
	}
	
	public int getValueAsInt()
	{
		return _value;
	}
}
