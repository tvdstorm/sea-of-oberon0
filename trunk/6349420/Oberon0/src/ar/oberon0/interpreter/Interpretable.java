package ar.oberon0.interpreter;

import ar.oberon0.interpreter.Memory.Context;

public interface Interpretable {
	public Object Interpret(Context context) throws Exception;

	
}
