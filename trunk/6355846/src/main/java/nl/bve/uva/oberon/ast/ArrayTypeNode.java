package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.ArrayValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ArrayTypeNode implements IInterpretableNode {
	private ExpressionNode expression;
	private IInterpretableNode arrayType;
	
	public ArrayTypeNode(ExpressionNode expression, IInterpretableNode arrayType) {
		this.expression = expression;
		this.arrayType = arrayType;
	}
	
	@Override
	public Object interpret(Environment env) {
		OberonValue size = (OberonValue)expression.eval(env);
		OberonValue type = (OberonValue)arrayType.interpret(env);
		
		return new ArrayValue(type, (Integer)size.getValue());
	}
}
