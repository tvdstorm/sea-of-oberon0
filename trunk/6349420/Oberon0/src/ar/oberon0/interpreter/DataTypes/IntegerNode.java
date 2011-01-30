package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Helper;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;

/*
 * This class is used to store oberon 0 integers.
 */
public class IntegerNode implements DataType
{
	/*
	 * The value of this node.
	 */
	private int _value;

	/*
	 * Create and init a new node. default value is 0;
	 */
	public IntegerNode()
	{
		this(0);
	}

	/*
	 * Create a new node with the value of the parameter.
	 */
	public IntegerNode(int value)
	{
		_value = value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		return Integer.valueOf(_value).hashCode();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (obj.getClass() != IntegerNode.class)
			return false;
		return _value == ((IntegerNode) obj)._value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.Interpretable#Interpret(ar.oberon0.interpreter
	 * .Memory.Context)
	 */
	@Override
	public Object Interpret(Context context) throws TechnicalException
	{
		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#MultiplyBy(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	public DataType MultiplyBy(DataType value) throws TechnicalException
	{
		if (!Helper.AreSameType(this, value))
			throw new TechnicalException("Could not multiply the type " + IntegerNode.class + " with a object of type " + value.getClass() + ".");

		return new IntegerNode(_value * ((IntegerNode) value)._value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "" + _value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#Add(ar.oberon0.interpreter.
	 * DataTypes.DataType)
	 */
	@Override
	public DataType Add(DataType value) throws TechnicalException
	{
		if (!Helper.AreSameType(this, value))
			throw new TechnicalException("Could not add the value of type " + IntegerNode.class + " with the value of type " + value.getClass() + ".");

		return new IntegerNode(_value + ((IntegerNode) value)._value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.oberon0.interpreter.DataTypes.DataType#Negate()
	 */
	@Override
	public DataType Negate()
	{
		return new IntegerNode(-_value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#Subtract(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	@Override
	public DataType Subtract(DataType value) throws TechnicalException
	{
		if (!Helper.AreSameType(this, value))
			throw new TechnicalException("Could not subtract the value of type " + IntegerNode.class + " from the value of type " + value.getClass() + ".");

		return new IntegerNode(_value - ((IntegerNode) value)._value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(DataType value)
	{
		if (!Helper.AreSameType(this, value))
			return -1;
		else
			return Integer.valueOf(_value).compareTo(((IntegerNode) value)._value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#Divide(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	@Override
	public DataType Divide(DataType value) throws TechnicalException
	{
		if (!Helper.AreSameType(this, value))
			throw new TechnicalException("Could not divide the value of type " + IntegerNode.class + " from the value of type " + value.getClass() + ".");

		return new IntegerNode(_value / ((IntegerNode) value)._value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#Modulo(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	@Override
	public DataType Modulo(DataType value) throws TechnicalException
	{
		if (!Helper.AreSameType(this, value))
			throw new TechnicalException("Could not modulo the value of type " + IntegerNode.class + " from the value of type " + value.getClass() + ".");

		return new IntegerNode(_value % ((IntegerNode) value)._value);
	}

	/*
	 * Return the java int value of this node.
	 */
	public int getValueAsInt()
	{
		return _value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.oberon0.interpreter.DataTypes.DataType#getType()
	 */
	@Override
	public CreatableType getType()
	{
		return new SimpleType("INTEGER");
	}
}
