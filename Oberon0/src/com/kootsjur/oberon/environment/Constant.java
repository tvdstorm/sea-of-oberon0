package com.kootsjur.oberon.environment;

import com.kootsjur.oberon.value.Value;

public class Constant {
	private Value value;

	public Constant() {
		this(null);
	}

	public Constant(Value value) {
		this.value = value;
	}

	public void set(Value value) {
		this.value = value;
	}

	public Value get() {
		return value;
	}
}
