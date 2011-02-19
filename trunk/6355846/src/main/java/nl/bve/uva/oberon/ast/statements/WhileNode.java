package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IInterpretableNode;
import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class WhileNode extends StatementNode {
	private ExpressionNode condition;
	private IInterpretableNode body;
	
	public WhileNode(ExpressionNode condition, IInterpretableNode body) {
		this.condition = condition;
		this.body = body;
	}
	
	@Override
	public void execute(Environment env) {
		while ( condition.eval(env).getValue() == OberonInt.TRUE) {
			body.interpret(env);
		}
	}
}
