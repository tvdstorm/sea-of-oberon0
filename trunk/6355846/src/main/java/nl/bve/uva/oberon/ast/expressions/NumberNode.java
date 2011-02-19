package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.OberonType;

public class NumberNode extends ExpressionNode {
	private int value;
	
	public NumberNode(Integer value) {
		this.value = value;
	}
	
	@Override
	public OberonType eval(Environment env) {
		return new OberonInt(value);
	}
	
	@Override
	public String toString() {
		return "number(" +value+ ")";
	}

}
