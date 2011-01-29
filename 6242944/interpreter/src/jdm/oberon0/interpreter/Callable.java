package jdm.oberon0.interpreter;

import jdm.oberon0.values.Value;

/**
 * Interface defining callable elements (like Procedures) from an Oberon0 program.
 */
public interface Callable {
	
	public int getArgumentCount();
	public abstract void execute(Context context, Value[] arguments);
}
