package ar.oberon0.interpreter;

import ar.oberon0.interpreter.Memory.Context;

/*
 * Interface used to ensure that nodes can be interpreted.
 * All the executable nodes have to implement this interface to be sure that it can be executed.
 */
public interface Interpretable
{
	/*
	 * Start the interpretation of the current object. The context contains the
	 * methods and data (constants, variables, etc.) that are reachable from the
	 * interpreting node.
	 */
	public Object Interpret(Context context) throws TechnicalException;
}
