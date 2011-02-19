package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.IExecutableNode;
import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.values.IntValue;

public class WhileNode implements IStatementNode {
	private IExpressionNode condition;
	private IExecutableNode body;
	
	public WhileNode(IExpressionNode condition, IExecutableNode body) {
		this.condition = condition;
		this.body = body;
	}
	
	@Override
	public void execute(Environment env) {
		while ( condition.eval(env).getValue() == IntValue.TRUE) {
			body.execute(env);
		}
	}
}
