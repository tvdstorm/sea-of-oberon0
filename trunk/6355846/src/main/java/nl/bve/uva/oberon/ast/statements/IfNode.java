package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IExecutableNode;
import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class IfNode implements IStatementNode {
	private IExpressionNode condition;
	private IExecutableNode body;
	private IStatementNode ifelse;
	
	public IfNode(IExpressionNode condition, IExecutableNode body, IStatementNode ifelse) {
		this.condition = condition;
		this.body = body;
		this.ifelse = ifelse;
	}
	
	@Override
	public void execute(Environment env) {
		OberonValue t = condition.eval(env);
		
		if (t.getValue() == IntValue.TRUE) {
			body.execute(env);
		} else if (ifelse != null) {
			ifelse.execute(env);
		}
	}
}