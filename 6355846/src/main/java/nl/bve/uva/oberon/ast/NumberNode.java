package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class NumberNode implements IInterpretableNode {
	private int value;
	
	public NumberNode(Integer value) {
		this.value = value;
	}
	
	@Override
	public Object interpret(Environment env) {
		return new OberonInt(value);
	}
	
	@Override
	public String toString() {
		return "number(" +value+ ")";
	}

}
