package nl.bve.uva.oberon.ast.expressions;

import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;
import nl.bve.uva.oberon.env.types.OberonType;

public class NegativeNumberNode extends ExpressionNode {
	private ExpressionNode expression;
	
	public NegativeNumberNode(ExpressionNode expression) {
		this.expression = expression;
	}
	
	@Override
	public OberonType eval(Environment env) {
		OberonType type = expression.eval(env);
		type.setValue(new OberonInt(type.getValue() * -1));
		
		return type;
	}
}
