package nl.bve.uva.oberon.env.types;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.env.Environment;

public class OberonInt extends Type implements IInterpretableNode {
	public static final int FALSE = 0;
	public static final int TRUE  = 1;
	
	private int value;
	
	public OberonInt(int value) {
		this.value = value;
	}
	
	@Override
	public Integer interpret(Environment env) {
		return value;
	}
	
	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void setValue(Object value) {
		assert value instanceof OberonInt : "Can only assign an Integer to an OberonInt!";
		
		this.value = ((OberonInt)value).interpret(null);
	}
	
	@Override
	public Type clone() {
		return new OberonInt(value);
	}
	
	@Override
	public Type evaluateSelector(String o) {
		throw new RuntimeException("Cannot evaluate an OberonInt type!");
	}
	
	@Override
	public String toString() {
		return value+"";
	}
}
