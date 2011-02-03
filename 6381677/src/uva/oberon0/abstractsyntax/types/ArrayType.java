package uva.oberon0.abstractsyntax.types;

import uva.oberon0.abstractsyntax.BaseNode;

public class ArrayType extends BaseType {

	private final BaseNode _length;
	private final BaseType _type;
	
	public ArrayType(BaseNode length, BaseType type)
	{
		assert length != null 		: "No Length is available for the current Array Type!";
		assert type != null 		: "No Type is available for the current Array Type!";

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
}
