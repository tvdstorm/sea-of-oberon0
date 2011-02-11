package nl.bve.uva.oberon.env;

public class OberonInt extends Type {
	private int value;
	
	public OberonInt(int value) {
		this.value = value;
	}
	
	@Override
	public Integer getValue() {
		return value;
	}
	
	@Override
	public void setValue(Object value) {
		assert value instanceof Integer : "Can only assign an Integer to an OberonInt!";
		
		this.value = (Integer) value;
	}
}
