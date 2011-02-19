package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonArray;
import nl.bve.uva.oberon.env.types.OberonType;

public class ArrayTypeNode implements IInterpretableNode {
	private ExpressionNode expression;
	private IInterpretableNode arrayType;
	
	public ArrayTypeNode(ExpressionNode expression, IInterpretableNode arrayType) {
		this.expression = expression;
		this.arrayType = arrayType;
	}
	
	@Override
	public Object interpret(Environment env) {
		OberonType size = (OberonType)expression.eval(env);
		OberonType type = (OberonType)arrayType.interpret(env);
		
		return new OberonArray(type, (Integer)size.getValue());
	}
}
