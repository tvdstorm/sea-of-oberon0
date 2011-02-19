package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IExecutableNode;
import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ElseIfNode extends StatementNode {
	private ExpressionNode condition;
	private IExecutableNode body;
	private StatementNode nextElse;
	
	public ElseIfNode(ExpressionNode condition, IExecutableNode body, StatementNode nextElse) {
		this.condition = condition;
		this.body = body;
		this.nextElse = nextElse;
	}
	
	@Override
	public void execute(Environment env) {
		OberonValue t = condition.eval(env);
		
		if (t.getValue() == IntValue.TRUE) {
			Environment subEnv = env.getNewSubSpace();
			body.execute(subEnv);
		} else if (nextElse != null) {
			nextElse.execute(env);
		}
	}
}
