package com.kootsjur.oberon.type;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public class UserType extends TypeDefinition {
	private String typeName;

	public UserType(String name) {
		super(DataType.USER);
		this.setTypeName(name);
	}

	@Override
	public Value initValue(Environment environment) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}

}
