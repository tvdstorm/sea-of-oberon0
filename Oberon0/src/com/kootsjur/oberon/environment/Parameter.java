package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.declaration.formalparameter.ParameterDirection;
import com.kootsjur.oberon.type.TypeDefinition;
import com.kootsjur.oberon.value.Value;

public class Parameter<T extends TypeDefinition, V extends Value> extends
		Var<T, V> {
	private ParameterDirection direction;

	public Parameter() {
		this(null);
	}

	public Parameter(T type) {
		this(type, null);
	}

	public Parameter(T type, ParameterDirection direction) {
		super(type);
		this.direction = direction;

	}

	public void setDirection(ParameterDirection direction) {
		this.direction = direction;
	}

	public ParameterDirection getDirection() {
		return direction;
	}
}
