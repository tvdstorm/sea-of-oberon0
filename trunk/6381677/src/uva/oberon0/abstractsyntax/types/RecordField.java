package uva.oberon0.abstractsyntax.types;

public class RecordField 
{
	private final ID 	_id;
	private final BaseType 	_type;
	
	public RecordField(ID id, BaseType type)
	{
		assert id != null 		: "No Identifier is available for the current Record Field!";
		assert type != null 	: "No Type is available for the current Record Field!";

		_id = id;
		_type = type;
	}

	public BaseType getType() {
		return _type;
	}

	public ID getID() {
		return _id;
	}
}
