package oberon0.interpreter.declaration;

import oberon0.interpreter.type.Type;

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
