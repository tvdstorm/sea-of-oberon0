package randy.value;

import randy.ast.Type;
import randy.exception.Oberon0Exception;

public class OReference extends OValue
{
	private OValue reference;
	
	public OReference(OValue _reference)
	{
		reference = _reference;
	}
	public OReference(OReference _value)
	{
		reference = _value.reference;
	}
	public OValue dereference()
	{
		return reference.dereference();
	}
	public void setValue(OValue _val) throws Oberon0Exception
	{
		reference.setValue(_val);
	}
	public Type getType()
	{
		return reference.getType();
	}
	@Override
	public String toString()
	{
		return reference.toString();
	}
}
