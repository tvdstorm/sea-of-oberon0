package nl.bve.uva.oberon.ast;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class WhileNode implements IInterpretableNode {
	private ExpressionNode condition;
	private IInterpretableNode body;
	
	public WhileNode(ExpressionNode condition, IInterpretableNode body) {
		this.condition = condition;
		this.body = body;
	}
	
	@Override
	public Object interpret(Environment env) {
		while ( condition.eval(env).getValue() == OberonInt.TRUE) {
			body.interpret(env);
		}
		
		return null;
	}
}
