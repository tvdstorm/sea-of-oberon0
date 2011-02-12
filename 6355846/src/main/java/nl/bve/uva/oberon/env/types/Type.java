package nl.bve.uva.oberon.env.types;

public abstract class Type {
	public abstract Integer getValue();
	public abstract void setValue(Type value);
	public abstract Type evaluateSelector(String o);
	
	@Override
	public abstract Type clone();
}
