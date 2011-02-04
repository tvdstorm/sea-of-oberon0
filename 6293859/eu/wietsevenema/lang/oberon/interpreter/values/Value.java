package eu.wietsevenema.lang.oberon.interpreter.values;


abstract public class Value {

	@Override
	abstract public boolean equals(Object o);

	@Override
	abstract public String toString();
	
	@Override
	abstract public Object clone();
	
}
