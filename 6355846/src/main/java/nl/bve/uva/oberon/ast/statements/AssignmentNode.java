package nl.bve.uva.oberon.ast.statements;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;

public class AssignmentNode extends StatementNode {
	private ExpressionNode lhn;
	private ExpressionNode rhn;
	
	public AssignmentNode(ExpressionNode lhn, ExpressionNode rhn) {
		this.lhn = lhn;
		this.rhn = rhn;
	}
	
	@Override
	public void execute(Environment env) {
		lhn.eval(env).setValue(rhn.eval(env));
	}
}
