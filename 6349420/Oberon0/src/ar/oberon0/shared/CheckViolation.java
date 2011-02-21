package ar.oberon0.shared;

import java.lang.reflect.Type;

public class CheckViolation {
	private String message;
	private Type javaSourceType;

	public String getMessage() {
		return this.message;
	}

	public CheckViolation(final String message, final Type javaSourceType) {
		this.message = message;
		this.javaSourceType = javaSourceType;
	}
}
