package jdm.oberon0.interpreter;

import jdm.oberon0.values.Value;

/**
 * Interface defining callable elements (like Procedures) from an Oberon0 program.
 */
public interface Callable {
	
	public abstract void execute(InterpreterContext context, Value[] arguments);
}
