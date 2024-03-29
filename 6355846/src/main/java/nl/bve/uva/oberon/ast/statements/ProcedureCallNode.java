package nl.bve.uva.oberon.ast.statements;

import java.util.List;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.Procedure;

public class ProcedureCallNode implements IStatementNode {
	private String ident;
	private List<IExpressionNode> actuals;
	
	public ProcedureCallNode(String ident, List<IExpressionNode> actuals) {
		this.ident = ident;
		this.actuals = actuals;
	}
	
	@Override
	public void execute(Environment env) {
		Procedure p = env.getProcedure(ident);
		
		assert p != null : "No procedure found, Environment returned null!";
		
		p.callProcedure(env, actuals);
	}
}
