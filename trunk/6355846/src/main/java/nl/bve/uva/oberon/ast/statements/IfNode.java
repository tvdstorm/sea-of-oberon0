package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IExecutableNode;
import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;
import nl.bve.uva.oberon.env.values.OberonValue;

public class IfNode extends StatementNode {
	private ExpressionNode condition;
	private IExecutableNode body;
	private StatementNode ifelse;
	
	public IfNode(ExpressionNode condition, IExecutableNode body, StatementNode ifelse) {
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