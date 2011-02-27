package com.kootsjur.oberon.value;

import java.util.List;

import com.kootsjur.oberon.type.TypeDefinition;

public class FieldList {
	private List<String> names;
	private TypeDefinition typeDefinition;

	public FieldList(List<String> names, TypeDefinition typeDefinition) {
		this.names = names;
		this.typeDefinition = typeDefinition;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public List<String> getNames() {
		return names;
	}

	public void setTypeDefinition(TypeDefinition typeDefinition) {
		this.typeDefinition = typeDefinition;
	}

	public TypeDefinition getTypeDefinition() {
		return typeDefinition;
	}
}
