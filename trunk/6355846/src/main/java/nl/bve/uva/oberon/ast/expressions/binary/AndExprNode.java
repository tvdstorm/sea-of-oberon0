package nl.bve.uva.oberon.ast.expressions.binary;

import nl.bve.uva.oberon.ast.expressions.ExpressionNode;
import nl.bve.uva.oberon.env.Environment;
import nl.bve.uva.oberon.env.types.OberonInt;

public class AndExprNode extends BinaryExpressionNode {
	public AndExprNode(ExpressionNode lhn, ExpressionNode rhn) {
		super(lhn, rhn);
	}
	
	@Override
	public OberonInt eval(Environment env) {
		int left = evalLhs(env);
		int right = evalRhs(env);
		
		if (left == OberonInt.TRUE && right == OberonInt.TRUE) {
			return new OberonInt(OberonInt.TRUE);
		} else {
			return new OberonInt(OberonInt.FALSE);
		}
	}
}
