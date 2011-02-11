package nl.bve.uva.oberon.env;

public class Constant extends Type {
	private OberonInt value;
	
	public Constant(OberonInt value) {
		this.value = value;
	}
	
	@Override
	public void setValue(Object value) {
		throw new IllegalArgumentException("Cannot change the value of a CONSTANT!");
	}
	
	@Override
	public Integer getValue() {
		return value.getValue();
	}
}
