package nl.bve.uva.oberon.env.types;

public class Constant extends Type {
	private OberonInt value;
	
	public Constant(OberonInt value) {
		this.value = value;
	}
	
	@Override
	public Integer getValue() {
		return value.getValue();
	}
	
	@Override
	public void setValue(Type value) {
		throw new RuntimeException("Cannot change the value of a CONSTANT!");
	}
	
	@Override
	public Type evaluateSelector(String o) {
		throw new RuntimeException("Cannot evaluate an OberonInt type!");
	}
	
	@Override
	public Type clone() {
		return new Constant(value);
	}
}
