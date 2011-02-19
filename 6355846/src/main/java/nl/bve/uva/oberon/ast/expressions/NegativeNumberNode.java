package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class NegativeNumberNode implements IExpressionNode {
	private IExpressionNode expression;
	
	public NegativeNumberNode(IExpressionNode expression) {
		this.expression = expression;
	}
	
	@Override
	public OberonValue eval(Environment env) {
		OberonValue type = expression.eval(env);
		type.setValue(new IntValue(type.getValue() * -1));
		
		return type;
	}
}
