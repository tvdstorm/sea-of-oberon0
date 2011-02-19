package oberon0.type;

public class RecordField {
	
	private final String identifier;
	private final Type type;
	
	public RecordField(String identifier, Type type) {
		super();
		this.identifier = identifier;
		this.type = type;
	}

	public String getIdentifier() {
		return identifier;
	}

	public Type getType() {
		return type;
	}
}
