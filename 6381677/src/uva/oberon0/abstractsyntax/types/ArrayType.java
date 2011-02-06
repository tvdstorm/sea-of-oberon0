package uva.oberon0.abstractsyntax.types;

import uva.oberon0.abstractsyntax.BaseNode;
import uva.oberon0.runtime.Scope;
import uva.oberon0.runtime.ScopeValueArray;
import uva.oberon0.runtime.ScopeValue;

public class ArrayType extends Type {

	private final BaseNode _length;
	private final Type _type;
	
	public ArrayType(BaseNode length, Type type)
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
	public Type getType()
	{
		return _type;
	}

	@Override
	public ScopeValue instantiate(Scope scope) {
		return new ScopeValueArray(scope, this);
	}
}
