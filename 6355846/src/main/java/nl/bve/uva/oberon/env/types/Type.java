package nl.bve.uva.oberon.env.types;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;

public abstract class Type implements IInterpretableNode {
	public abstract Object getValue();
	public abstract void setValue(Object value);
	
	public abstract Type evaluateSelector(String o);
	
	@Override
	public abstract Type clone();
	
	@Override
	public abstract Integer interpret(Environment env);
}
