package oberon0.interpreter.expression;

import oberon0.interpreter.module.Module;

public interface Expression {
	
	Expression evaluate(Module module);
	
	public String getType();
}
