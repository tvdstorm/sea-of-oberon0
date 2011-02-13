package nl.bve.uva.oberon.env.types;

public abstract class OberonType {
	public abstract Integer getValue();
	public abstract void setValue(OberonType value);
	public abstract OberonType evaluateSelector(String o);
	
	@Override
	public abstract OberonType clone();
}
