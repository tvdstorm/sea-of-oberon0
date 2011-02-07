package com.kootsjur.oberon.value;

public class Int extends Value {

	private final Integer value;

	public Int(int value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
}
