package oberon0.expression;

import oberon0.module.Module;

public interface Expression {
	
	Expression evaluate(Module module);
	
	public String getType();
}
