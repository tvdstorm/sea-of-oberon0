package oberon0.declaration;

import oberon0.type.Type;

public class TypeDeclaration {
	
	private String typeName;
	private Type type;
	
	public TypeDeclaration(String typeName,Type type) {
		this.typeName = typeName;
		this.type = type;
	}


	public Type getType() {
		return type;
	}

	public String getTypeName() {
		return typeName;
	}
	
}
