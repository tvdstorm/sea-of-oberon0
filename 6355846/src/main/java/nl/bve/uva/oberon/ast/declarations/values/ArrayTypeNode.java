package nl.bve.uva.oberon.ast.declarations.values;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.ArrayValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ArrayTypeNode implements ITypeNode {
	private IExpressionNode expression;
	private ITypeNode arrayType;
	
	public ArrayTypeNode(IExpressionNode expression, ITypeNode arrayType) {
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
