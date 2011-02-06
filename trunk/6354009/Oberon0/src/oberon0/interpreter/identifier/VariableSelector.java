package oberon0.interpreter.identifier;


public class VariableSelector extends Selector {
	
	public static String TYPE = "SELECTOR_VARIABLE";
	
	private String variable;
	
	public VariableSelector(String variable) {
		super(TYPE);
		this.variable = variable;
	}

	public String getVariable() {
		return variable;
	}
}
