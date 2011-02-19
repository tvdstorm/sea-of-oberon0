package nl.bve.uva.oberon.ast;

import java.util.List;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.procedures.Procedure;

public class ProcedureCallNode implements IInterpretableNode {
	private String ident;
	private List<ExpressionNode> actuals;
	
	public ProcedureCallNode(String ident, List<ExpressionNode> actuals) {
		this.ident = ident;
		this.actuals = actuals;
	}
	
	@Override
	public Object interpret(Environment env) {
		Procedure p = env.getProcedure(ident);
		
		assert p != null : "No procedure found, Environment returned null!";
		
		p.callProcedure(env, actuals);
		
		return null;
	}
}
