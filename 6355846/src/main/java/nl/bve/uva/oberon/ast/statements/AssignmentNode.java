package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.expressions.IExpressionNode;
import nl.bve.uva.oberon.env.Environment;

public class AssignmentNode implements IStatementNode {
	private IExpressionNode lhn;
	private IExpressionNode rhn;
	
	public AssignmentNode(IExpressionNode lhn, IExpressionNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
	}
	
	@Override
	public void execute(Environment env) {
		lhn.eval(env).setValue(rhn.eval(env));
	}
}
