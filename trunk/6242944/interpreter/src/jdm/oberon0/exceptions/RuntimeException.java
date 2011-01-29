package jdm.oberon0.exceptions;

/**
 * Base class for runtime exceptions raised by the interpreter.
 */
public class RuntimeException extends java.lang.RuntimeException {

	public RuntimeException(String type) {
		super(type);
	}

	private static final long serialVersionUID = 103240682019761841L;
}
