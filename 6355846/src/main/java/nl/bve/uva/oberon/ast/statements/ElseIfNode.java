package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IExecutableNode;
import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class ElseIfNode implements IStatementNode {
	private IExpressionNode condition;
	private IExecutableNode body;
	private IStatementNode nextElse;
	
	public ElseIfNode(IExpressionNode condition, IExecutableNode body, IStatementNode nextElse) {
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
