package nl.bve.uva.oberon.ast.types;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.ArrayValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ArrayNode implements IValueNode {
	private IExpressionNode expression;
	private IValueNode arrayType;
	
	public ArrayNode(IExpressionNode expression, IValueNode arrayType) {
		this.expression = expression;
		this.arrayType = arrayType;
	}
	
	@Override
	public OberonValue initializeNew(Environment env) {
		OberonValue size = expression.eval(env);
		OberonValue type = arrayType.initializeNew(env);
		
		return new ArrayValue(type, size.getValue());
	}
}
