package ar.oberon0.interpreter.Memory;

import ar.oberon0.interpreter.Interpretable;
import ar.oberon0.interpreter.TechnicalException;
import ar.oberon0.interpreter.DataTypes.CreatableType;
import ar.oberon0.interpreter.DataTypes.DataType;

/*
 * A DataField is used to store data. Using a DataField it becomes easy to pass parameters by reference or by value.
 * If a parameter has to be passed by value a clone of the DataField is created that points to another DataField object.
 * If the procedure eddits the value of the DataField it won't be eddited in the calling procedure. 
 * If a clone isn't made the DataField is passed by reference.
 */
public class DataField implements Interpretable
{
	/*
	 * The type of the item stored in the DataField.
	 */
	private CreatableType _type;
	/*
	 * The actual value.
	 */
	private DataType _value;

	public CreatableType getType()
	{
		return _type;
	}

	/*
	 * Create a new DataField of the specified type.
	 */
	public DataField(CreatableType type)
	{
		this(type, null);
	}

	/*
	 * Create a new DataField of the specified type and with the specified
	 * value.
	 */
	public DataField(CreatableType type, DataType value)
	{
		_type = type;
		_value = value;
	}

	/*
	 * Get the value of this DataField.
	 */
	public DataType getValue(Context context) throws TechnicalException
	{
		IfNotInitInit(context);
		return _value;
	}

	/*
	 * Set the value of the DataField.
	 */
	public void setValue(DataType value, Context context) throws TechnicalException
	{
		if (value.getType().getClass() != _type.getClass())
		{
			throw new IllegalArgumentException("The value was of type " + value.getType().getClass() + " while " + _type.getClass() + " was expected.");
		}
		IfNotInitInit(context);
		_value = value;
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
		IfNotInitInit(context);
		return getValue(context);
	}

	/*
	 * If the DataField isn't initialized then initialize the DataField. This is
	 * needed else a null pointer exception will be thrown when an assignment is
	 * done.
	 */
	private void IfNotInitInit(Context context) throws TechnicalException
	{
		if (_value == null)
		{
			_value = _type.createInstance(context);
		}
	}

	/*
	 * Create a new DataField with the same value.
	 */
	public DataField Clone()
	{
		return new DataField(_type, _value);
	}

}
