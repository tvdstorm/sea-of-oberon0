package nl.bve.uva.oberon.ast.types;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.ArrayValue;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ArrayTypeNode implements IOberonTypeNode {
	private IExpressionNode expression;
	private IOberonTypeNode arrayType;
	
	public ArrayTypeNode(IExpressionNode expression, IOberonTypeNode arrayType) {
		this.expression = expression;
		this.arrayType = arrayType;
	}
	
	@Override
	public OberonValue initializeNew(Environment env) {
		OberonValue size = expression.eval(env);
		OberonValue type = arrayType.initializeNew(env);
		
		return new ArrayValue(type, ((IntValue)size).getValue());
	}
}
