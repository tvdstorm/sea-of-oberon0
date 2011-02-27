package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.type.TypeDefinition;

public class Type {
	private TypeDefinition type;

	public Type() {
		this(null);
	}

	public Type(TypeDefinition type) {
		this.type = type;
	}

	public void setType(TypeDefinition type) {
		this.type = type;
	}

	public TypeDefinition getType() {
		return type;
	}

}
