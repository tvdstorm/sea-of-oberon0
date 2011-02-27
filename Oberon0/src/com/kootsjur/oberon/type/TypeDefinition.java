package com.kootsjur.oberon.type;

import com.kootsjur.oberon.environment.Environment;
import com.kootsjur.oberon.value.Value;

public abstract class TypeDefinition {
	public enum DataType {
		USER, ARRAY, RECORD, INTEGER, BOOL;
	}

	private DataType dataType;
	private String name;

	public TypeDefinition(String name) {
		this.name = name;
		this.dataType = DataType.USER;
	}

	public TypeDefinition(DataType dataType) {
		this.dataType = dataType;
		this.name = "";
	}

	public TypeDefinition(String name, DataType dataType) {
		this.name = name;
		this.dataType = dataType;
	}

	public void setDataType(DataType dataType) {
		this.dataType = dataType;
	}

	public DataType getDataType() {
		return dataType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract Value initValue(Environment environment);
}
