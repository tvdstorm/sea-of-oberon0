package nl.bve.uva.oberon.env;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.Type;

public class Constant extends Type implements IInterpretableNode {
	private OberonInt value;
	
	public Constant(OberonInt value) {
		this.value = value;
	}
	
	@Override
	public Integer interpret(Environment env) {
		return value.interpret(env);
	}
	
	@Override
	public void setValue(Object value) {
		throw new RuntimeException("Cannot change the value of a CONSTANT!");
	}
	
	@Override
	public Object getValue() {
		return value;
	}
	
	@Override
	public Type clone() {
		return new Constant(value);
	}
	
	@Override
	public Type evaluateSelector(String s) {
		// TODO Auto-generated method stub
		return null;
	}
}
