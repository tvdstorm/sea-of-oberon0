package nl.bve.uva.oberon.env.types;

public class OberonConstant extends OberonType {
	private OberonInt value;
	
	public OberonConstant(OberonInt value) {
		this.value = value;
	}
	
	@Override
	public Integer getValue() {
		return value.getValue();
	}
	
	@Override
	public void setValue(OberonType value) {
		throw new RuntimeException("Cannot change the value of a CONSTANT!");
	}
	
	@Override
	public OberonType evaluateSelector(String o) {
		throw new RuntimeException("Cannot evaluate an OberonInt type!");
	}
	
	@Override
	public OberonType clone() {
		return new OberonConstant(value);
	}
}
