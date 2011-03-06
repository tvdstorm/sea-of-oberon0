package eu.wietsevenema.lang.oberon.interpreter.values;

abstract public class Value {

	@Override
	abstract public boolean equals(Object o);

	@Override
	abstract public Object clone();
	
	/**
	 * Init value to a sensible default. Used in array and record initialisation.
	 */
	abstract public void init();
	

}
