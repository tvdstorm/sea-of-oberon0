package uva.oberon0.abstractsyntax.types;

public class RecordField 
{
	private final ID 	_id;
	private final Type 	_type;
	
	public RecordField(ID id, Type type)
	{
		assert id != null 		: "No Identifier is available for the current Record Field!";
		assert type != null 	: "No Type is available for the current Record Field!";

		_id = id;
		_type = type;
	}

	public Type getType() {
		return _type;
	}

	public ID getID() {
		return _id;
	}
}
