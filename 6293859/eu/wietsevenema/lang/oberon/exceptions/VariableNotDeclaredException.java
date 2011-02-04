package eu.wietsevenema.lang.oberon.exceptions;

public class VariableNotDeclaredException extends Exception {

	public VariableNotDeclaredException(String string) {
		super(string);
	}

	public VariableNotDeclaredException() {
		super();
	}

	private static final long serialVersionUID = -6621355018509955075L;

}
