package ar.oberon0.interpreter.DataTypes;

import ar.oberon0.interpreter.Memory.Context;
import ar.oberon0.interpreter.Memory.DataField;

public class Array implements DataType {

	DataField[] _items;
	
	public Array(IntegerNode length, CreatableType type, Context context)
	{
		InitArray(length, type);
	}
	
	private void InitArray(IntegerNode length, CreatableType type)
	{
		_items = new DataField[length.getValueAsInt()];
		for(int i = 0; i < length.getValueAsInt(); i++)
		{			
			_items[i] = new DataField(type);
		}
	}
	
	public DataField getVarAt(IntegerNode index)
	{
		return _items[index.getValueAsInt()];
	}
	
	public DataType getValueAt(IntegerNode index,Context context)
	{
		return _items[index.getValueAsInt()].getValue(context);
	}
	
	@Override
	public Object Interpret(Context context) throws Exception {
		return this; 
	}

	@Override
	public int compareTo(Object arg0) {
		return Integer.MIN_VALUE;
	}

	@Override
	public DataType Clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataType MultiplyBy(DataType value) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataType Add(DataType value) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataType Negate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataType Subtract(DataType value) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataType Divide(DataType value) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataType Modulo(DataType value) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
