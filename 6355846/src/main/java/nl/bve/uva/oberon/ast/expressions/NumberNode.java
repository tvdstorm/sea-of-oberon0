package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class NumberNode extends ExpressionNode {
	private int value;
	
	public NumberNode(Integer value) {
		this.value = value;
	}
	
	@Override
	public OberonValue eval(Environment env) {
		return new IntValue(value);
	}
	
	@Override
	public String toString() {
		return "number(" +value+ ")";
	}

}
