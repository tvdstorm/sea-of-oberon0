package uva.oberon0.abstractsyntax.types;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;

public class ArrayType extends BaseType {

	private BaseNode _length;
	private BaseType _type;
	
	public ArrayType(BaseNode length, BaseType type)
	{
		_length = length;
		_type = type;
	}
	
	/**
	 * Gets the array Length of this Variable Declaration Node.
	 */
	public BaseNode getLength()
	{
		return _length;
	}
	
	/**
	 * Gets the data Type of this Variable Declaration Node.
	 */
	public BaseType getType()
	{
		return _type;
	}
	
	@Override
	public int eval(Scope scope) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

}
