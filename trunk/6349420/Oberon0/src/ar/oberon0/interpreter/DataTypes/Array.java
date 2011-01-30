package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

/*
 * This class is used to store datafields in a list. Array is a default oberon 0 datastructure.
 */
public class Array implements DataType
{
	/*
	 * The java aray containing the DataFields (variables).
	 */
	private DataField[] _items;
	/*
	 * The type of the elements in the array.
	 */
	private CreatableType _childType;
	/*
	 * The length of the array.
	 */
	private IntegerNode _length;

	/*
	 * Create a new array of length length and of type childType.
	 */
	protected Array(IntegerNode length, CreatableType childType)
	{
		_childType = childType;
		_length = length;
		InitArray(length, childType);
	}

	/*
	 * When an array is created it only contains null values. When the oberon 0
	 * program tries to set a value in the array a null pointer exception will
	 * be returned if the datafields are not initialized. because of this reason
	 * every element in the array is initialized when the array is created.
	 */
	private void InitArray(IntegerNode length, CreatableType type)
	{
		_items = new DataField[length.getValueAsInt()];
		for (int i = 0; i < length.getValueAsInt(); i++)
		{
			_items[i] = new DataField(type);
		}
	}

	/*
	 * Get the datafield at location the specified index.
	 */
	public DataField getDataFieldAt(IntegerNode index)
	{
		return _items[index.getValueAsInt()];
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
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(DataType value)
	{
		return Integer.MIN_VALUE;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ar.oberon0.interpreter.DataTypes.DataType#MultiplyBy(ar.oberon0.interpreter
	 * .DataTypes.DataType)
	 */
	@Override
	public DataType MultiplyBy(DataType value) throws TechnicalException
	{
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.oberon0.interpreter.DataTypes.DataType#Negate()
	 */
	@Override
	public DataType Negate()
	{
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.oberon0.interpreter.DataTypes.DataType#getType()
	 */
	@Override
	public CreatableType getType()
	{
		return new ArrayType(_length, _childType);
	}

}
