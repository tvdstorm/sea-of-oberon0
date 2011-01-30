package oberon;

import oberon.node.AVardecl;

public class ArrayVariable implements INamedClass, IDeepCopyable<ArrayVariable> {
	public String _name;
	public int[] _array;
	
	public ArrayVariable(String name)
	{
		_name = name;
		_array = new int[100];
	}
	
	public ArrayVariable(String name, int[] array) {
		_name = name;
		_array = array;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public int getValue(int index)
	{
		if (_array != null &&
				_array.length > index &&
				index >= 0)
		{
			return _array[index];
		}
		
		//TODO 
		return 0;
	}

	public void setValue(int index, int value) {
		if (_array != null &&
				_array.length > index &&
				index >= 0)
		{
			_array[index] = value;
		}
	}
	
	@Override
	public ArrayVariable DeepCopy() {
		return new ArrayVariable(_name, _array);
	}

	public ArrayVariable ShallowCopy(String name) {
		return new ArrayVariable(name, _array);
	}

}
