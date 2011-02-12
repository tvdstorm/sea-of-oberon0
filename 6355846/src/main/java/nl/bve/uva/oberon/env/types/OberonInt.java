package nl.bve.uva.oberon.env.types;

public class OberonInt extends Type {
	public static final int FALSE = 0;
	public static final int TRUE  = 1;
	
	private int value;
	
	public OberonInt(int value) {
		this.value = value;
	}
	
	@Override
	public Integer getValue() {
		return value;
	}
	
	@Override
	public void setValue(Type value) {
		if (! (value instanceof OberonInt)) {
			throw new RuntimeException("Can only assign an OberonInt to an OberonInt (found: " +value.getClass().getCanonicalName());
		}
		this.value = value.getValue();
	}
	
	@Override
	public Type evaluateSelector(String o) {
		throw new RuntimeException("Cannot evaluate an OberonInt type!");
	}
	
	@Override
	public Type clone() {
		return new OberonInt(value);
	}
	
	@Override
	public String toString() {
		return value+"";
	}
}
