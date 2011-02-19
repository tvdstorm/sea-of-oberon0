package nl.bve.uva.oberon.ast.declarations.values;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.ArrayValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ArrayTypeNode extends TypeNode {
	private ExpressionNode expression;
	private TypeNode arrayType;
	
	public ArrayTypeNode(ExpressionNode expression, TypeNode arrayType) {
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
